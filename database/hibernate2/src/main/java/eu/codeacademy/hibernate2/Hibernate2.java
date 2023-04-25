package eu.codeacademy.hibernate2;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class Hibernate2 {
    public static void main(String[] args) {
        SessionFactory createdFactory = new Configuration().configure().buildSessionFactory();

        System.out.println("Hello World!");
    }
}
