package eu.codeacademy.javaua2;

import com.fasterxml.jackson.databind.ObjectMapper;
import eu.codeacademy.javaua2.model.Car;
import eu.codeacademy.javaua2.model.Person;
import eu.codeacademy.javaua2.utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class JacksonJson {
    public static void main(String[] args) throws IOException, URISyntaxException {
        ObjectMapper objectMapper = new ObjectMapper();

        Person person = new Person("Petras", 25);

        File personJsonFile = new File("target/person.json");
        objectMapper.writeValue(personJsonFile, person);

        Person personDeserialized = objectMapper.readValue(personJsonFile, Person.class);
        System.out.println(personDeserialized);

        File carJsonFile = FileUtils.getFileFromResource("car.json");
        Car carDeserialized = objectMapper.readValue(carJsonFile, Car.class);
        System.out.println(carDeserialized);
    }
}
