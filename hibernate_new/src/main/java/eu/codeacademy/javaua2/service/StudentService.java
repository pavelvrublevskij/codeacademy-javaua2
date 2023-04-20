package eu.codeacademy.javaua2.service;

import eu.codeacademy.javaua2.model.Student;
import eu.codeacademy.javaua2.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentService {

    public void createStudent(Student student) {

        SessionFactory factory = HibernateUtil.getSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student);

        transaction.commit();
    }


}
