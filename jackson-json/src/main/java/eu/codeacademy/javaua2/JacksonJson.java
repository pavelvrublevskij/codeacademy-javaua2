package eu.codeacademy.javaua2;

import com.fasterxml.jackson.databind.ObjectMapper;
import eu.codeacademy.javaua2.model.Person;

import java.io.File;
import java.io.IOException;

public class JacksonJson {
    public static void main(String[] args) throws IOException {
        Person person = new Person("Petras", 25);

        File personJsonFile = new File("target/person.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(personJsonFile, person);

        Person personDeserialized = objectMapper.readValue(personJsonFile, Person.class);
        System.out.println(personDeserialized);
    }
}
