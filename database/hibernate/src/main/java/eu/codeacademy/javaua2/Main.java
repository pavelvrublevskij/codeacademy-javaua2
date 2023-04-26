package eu.codeacademy.javaua2;

import eu.codeacademy.javaua2.model.Rector;
import eu.codeacademy.javaua2.model.Student;
import eu.codeacademy.javaua2.model.University;
import eu.codeacademy.javaua2.service.StudentService;
import eu.codeacademy.javaua2.service.UniversityService;
import eu.codeacademy.javaua2.util.HibernateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        UniversityService universityService = new UniversityService();
        Student newStudent = new Student();
        newStudent.setName("Romanas");
        newStudent.setSurname("Ramutis");
        newStudent.setCourse(3);
        studentService.createStudent(newStudent);

        universityService.printRectorByUniversityName("KTU");


    }
}