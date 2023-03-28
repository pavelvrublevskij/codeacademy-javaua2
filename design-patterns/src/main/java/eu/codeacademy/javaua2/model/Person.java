package eu.codeacademy.javaua2.model;

import lombok.Getter;

@Getter
public class Person {

    // variables
    // getter, setters, constructor

    private final String name;
    private final String surname;

    public Person(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public static class Builder {
        // builder code with constructor, variables and setters

        private String name;
        private String surname;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
