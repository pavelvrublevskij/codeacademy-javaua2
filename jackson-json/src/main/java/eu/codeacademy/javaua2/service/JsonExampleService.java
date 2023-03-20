package eu.codeacademy.javaua2.service;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import eu.codeacademy.javaua2.model.Car;
import eu.codeacademy.javaua2.model.Person;
import eu.codeacademy.javaua2.utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class JsonExampleService {

    final ObjectMapper objectMapper = new ObjectMapper();

    public void basicSerializeAndDeserializeExample() {
        Person person = new Person("Petras", 25);

        File personJsonFile = new File("target/person.json");
        try {
            objectMapper.writeValue(personJsonFile, person);
            Person personDeserialized = objectMapper.readValue(personJsonFile, Person.class);
            System.out.println(personDeserialized);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void basicDeserializationFromResources() {
        File carJsonFile = null;
        try {
            carJsonFile = FileUtils.getFileFromResource("car.json");
            Car carDeserialized = objectMapper.readValue(carJsonFile, Car.class);
            System.out.println(carDeserialized);
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
