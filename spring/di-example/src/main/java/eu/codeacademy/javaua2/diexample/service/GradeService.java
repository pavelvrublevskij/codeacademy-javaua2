package eu.codeacademy.javaua2.diexample.service;

import eu.codeacademy.javaua2.diexample.dao.MarksDao;
import org.springframework.stereotype.Service;

@Service
public class GradeService {

    private final MarksDao marksDao;

    public GradeService(MarksDao marksDao) {
        this.marksDao = marksDao;
    }

    public Double avarageGrade () {
        Double sum = 0.0;

        for (Integer grade: marksDao.getMarks()) {
            sum += grade;
        }

        return sum / marksDao.getMarks().size();
    }
}
