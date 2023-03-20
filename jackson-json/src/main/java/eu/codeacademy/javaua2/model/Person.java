package eu.codeacademy.javaua2.model;

import java.util.StringJoiner;

public class Person {

    private String name;
    private int age;
    private boolean gender;
    private Car car;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("age=" + age)
                .add("gender=" + gender)
                .add("car=" + car)
                .toString();
    }
}
