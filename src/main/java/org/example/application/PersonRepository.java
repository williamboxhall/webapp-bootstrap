package org.example.application;

import org.springframework.stereotype.Repository;

import static com.google.common.collect.Lists.newArrayList;

@Repository
public class PersonRepository {
    public Person get(int id) {
        // pretend like we went to the microservice
        return new Person("Mr", String.valueOf(id), String.valueOf(id), "chef", 30 + id);
    }
}
