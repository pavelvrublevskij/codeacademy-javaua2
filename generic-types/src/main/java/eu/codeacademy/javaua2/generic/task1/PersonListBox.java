package eu.codeacademy.javaua2.generic.task1;

import eu.codeacademy.javaua2.generic.task1.model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonListBox implements ListBox<Person> {

    private List<Person> persons;

    public PersonListBox(List<Person> persons) {
        this.persons = persons;
    }

    @Override
    public void addElements(Person[] values) {
        this.persons.addAll(List.of(values));
    }

    @Override
    public void addElement(Person value) {
        this.persons.add(value);
    }

    @Override
    public List<Person> getElements() {
        return this.persons;
    }
}
