package org.example.application.mapping;

import org.example.application.PersonRepository;
import org.example.application.StaffMember;
import org.example.infrastructure.AbstractConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IdToStaffMemberConverter extends AbstractConverter<Integer, StaffMember> {
    private final PersonRepository personRepository;

    @Autowired
    public IdToStaffMemberConverter(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public StaffMember createDestinationObject(Integer id) {
        return getObjectAssembler().assemble(personRepository.get(id), StaffMember.class);
    }
}
