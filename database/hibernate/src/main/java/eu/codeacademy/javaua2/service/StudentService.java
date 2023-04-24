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

    public Student findStudentById(Long id) {

        SessionFactory factory = HibernateUtil.getSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.find(Student.class, id);

        transaction.commit();
        System.out.println(student.toString());
        return student;
    }

    public Student updateStudentById(Long id, Student newStudent) {

        SessionFactory factory = HibernateUtil.getSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.find(Student.class, id);

        student.setName(newStudent.getName());
        student.setCourse(newStudent.getCourse());
        student.setSurname(newStudent.getSurname());

        session.persist(student);
        transaction.commit();

        return student;
    }


}
