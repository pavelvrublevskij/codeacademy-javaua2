package eu.codeacademy.javaua2.pattern.builder;

import eu.codeacademy.javaua2.model.Person;

public class BuilderPattern {

    public Person createPerson(String name, String surname) {
        return new Person.Builder()
                .name(name)
                .surname(surname)
                .build();
    }
}
