package eu.codeacademy.javaua2.generic.task1.model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Person {
    private final String name;
    private final String surname;
}
