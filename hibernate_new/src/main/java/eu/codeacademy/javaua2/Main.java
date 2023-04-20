package eu.codeacademy.javaua2;

import eu.codeacademy.javaua2.model.Student;
import eu.codeacademy.javaua2.service.StudentService;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        Student newStudent = new Student();
        newStudent.setName("Romanas");
        newStudent.setSurname("Ramutis");
        newStudent.setCourse(3);
        studentService.createStudent(newStudent);

    }
}