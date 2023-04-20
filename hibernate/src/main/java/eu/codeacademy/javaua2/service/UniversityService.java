package eu.codeacademy.javaua2.service;

import eu.codeacademy.javaua2.model.University;
import eu.codeacademy.javaua2.util.HibernateUtil;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UniversityService {

    public void createUniversity(University university) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(university);
        transaction.commit();

    }

    public University findUniversityById(Long id) {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        University university = session.find(University.class, id);
        transaction.commit();

        System.out.println(university.toString());
        return university;

    }


}
