package eu.codeacademy.javaua2.diexample.service;

import eu.codeacademy.javaua2.diexample.dao.InternalMarksDao;
import eu.codeacademy.javaua2.diexample.dao.MarksDao;

public class GradeService {

    private MarksDao marksDao = new InternalMarksDao();

    public Double avarageGrade () {
        Double sum = 0.0;

        for (Integer grade: marksDao.getMarks()) {
            sum += grade;
        }

        return sum / marksDao.getMarks().size();
    }
}
