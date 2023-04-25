package eu.codeacademy.hibernate2.examples;

import eu.codeacademy.hibernate2.helper.DaoManagerHelper;
import eu.codeacademy.hibernate2.pojo.EmployeePojo;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class HibernateQueryExample {

    public static void main(String[] args) {
        try (Session ss = DaoManagerHelper.getSession()) {
            Query<EmployeePojo> query = ss.createQuery("FROM EmployeePojo", EmployeePojo.class);
            List<EmployeePojo> employees = query.list();

            employees.forEach(System.out::println);
        }
    }
}
