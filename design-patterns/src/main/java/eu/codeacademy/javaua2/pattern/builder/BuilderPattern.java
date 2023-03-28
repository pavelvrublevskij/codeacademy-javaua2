package eu.codeacademy.javaua2.pattern.builder;

import eu.codeacademy.javaua2.model.Person;

public class BuilderPattern {

    public Person createPerson(String name, String surname) {
        // galime sukurti per konstruktoriu
        Person person = new Person(name, surname);

        // arba naudojant seterius
        person.setName(name);
        person.setSurname(surname);

        return person;
    }
}
