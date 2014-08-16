package org.example.application.mapping;

import com.googlecode.simpleobjectassembler.SimpleObjectAssembler;
import org.example.application.*;
import org.example.infrastructure.Mapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static com.google.common.collect.Lists.newArrayList;
import static org.mockito.Mockito.when;
import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;


@RunWith(MockitoJUnitRunner.class)
public class StaffedBakeryMappingTest {
    private final Person first = new Person("Mr", "Ringo", "Starr", "drummer", 70);
    private Person second = new Person("Mr", "Barrack", "Obama", "president", 50);
    private Person third = new Person("Mrs", "?", "Robinson", "from that song", 20);
    private Bakery bakery = new Bakery("Ditsch", new Location("1 Happy St", "Lat:40.712784,Long:-74.005941"), newArrayList(10, 20, 30));
    @Mock
    private PersonRepository personRepository;
    private Mapper mapper;

    @Before
    public void setUp() {
        SimpleObjectAssembler simpleObjectAssembler = new SimpleObjectAssembler();
        IdToStaffMemberConverter converter = new IdToStaffMemberConverter(personRepository);
        converter.setObjectAssembler(simpleObjectAssembler);
        simpleObjectAssembler.registerConverter(converter);
        simpleObjectAssembler.setAutomapWhenNoConverterFound(true);
        mapper = new Mapper(simpleObjectAssembler);
    }

    @Test
    public void createsStaffedBakeryFromBakeryAndUserResources() {
        when(personRepository.get(10)).thenReturn(first);
        when(personRepository.get(20)).thenReturn(second);
        when(personRepository.get(30)).thenReturn(third);

        StaffedBakery expected = new StaffedBakery("Ditsch",
                new Location("1 Happy St", "Lat:40.712784,Long:-74.005941"),
                newArrayList(
                        new StaffMember("Ringo", "drummer", "70"),
                        new StaffMember("Barrack", "president", "50"),
                        new StaffMember("?", "from that song", "20")
                ));

        assertReflectionEquals(mapper.map(bakery, StaffedBakery.class), expected);
    }
}