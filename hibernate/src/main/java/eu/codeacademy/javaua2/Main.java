package eu.codeacademy.javaua2;

import eu.codeacademy.javaua2.model.Student;
import eu.codeacademy.javaua2.model.University;
import eu.codeacademy.javaua2.service.StudentService;
import eu.codeacademy.javaua2.service.UniversityService;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        UniversityService universityService = new UniversityService();
        Student newStudent = new Student();
        newStudent.setName("Romanas");
        newStudent.setSurname("Ramutis");
        newStudent.setCourse(3);
        studentService.createStudent(newStudent);

        University university = new University(null, "KTU", 1922);
        universityService.createUniversity(university);

        studentService.findStudentById(13L);
        universityService.findUniversityById(1L);

        Student updateStudent = new Student();
        updateStudent.setName("NAME_NEW");
        updateStudent.setSurname("SURNAME_NEW");
        updateStudent.setCourse(5);
        studentService.updateStudentById(13L, updateStudent);


    }
}