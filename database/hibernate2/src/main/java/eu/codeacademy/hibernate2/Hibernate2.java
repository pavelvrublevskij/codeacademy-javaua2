package eu.codeacademy.hibernate2;

import eu.codeacademy.hibernate2.pojo.EmployeePojo;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class Hibernate2 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/ca");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "postgres");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        configuration.setProperty("hibernate.connection.autocommit", "true");
        configuration.setProperty("hibernate.show_sql", "true");
        configuration.setProperty("hibernate.hbm2ddl.auto", "create-drop");

        configuration.addAnnotatedClass(EmployeePojo.class);

        configuration.buildSessionFactory();

        System.out.println("Hello World!");
    }
}
