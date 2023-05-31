package eu.codeacademy.javaua2.diexample;

import eu.codeacademy.javaua2.diexample.dao.InternalMarksDao;
import eu.codeacademy.javaua2.diexample.service.GradeService;

public class Application {

    public static void main(String[] args) {
        System.out.println("Pazymiu vidurkis: " + new GradeService(new InternalMarksDao()).avarageGrade());
    }
}
