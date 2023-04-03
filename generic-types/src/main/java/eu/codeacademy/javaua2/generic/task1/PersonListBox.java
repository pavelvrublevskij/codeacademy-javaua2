package eu.codeacademy.javaua2.generic.task1;

import eu.codeacademy.javaua2.generic.GenericListBox;
import eu.codeacademy.javaua2.generic.task1.model.Person;

import java.util.List;

public class PersonListBox extends GenericListBox<Person> {

    public PersonListBox(List<Person> elements) {
        super(elements);
    }
}
