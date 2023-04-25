package eu.codeacademy.hibernate2.examples;

import eu.codeacademy.hibernate2.helper.DaoManagerHelper;
import eu.codeacademy.hibernate2.pojo.EmployeePojo;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CrudExample {

    public static void main(String[] args) {
        Session ss = DaoManagerHelper.getSession();

        createNewEmployee(ss);
    }

    private static void createNewEmployee(Session ss) {
        Transaction transaction = null;
        try {
            EmployeePojo employee = EmployeePojo.builder()
                    .name("Valdas")
                    .surname("Adamkus")
                    .email("va@lietuva.lt")
                    .phoneNumber("002")
                    .build();

            transaction = ss.beginTransaction();
            ss.persist(employee);
            transaction.commit();
        } finally {
            if (transaction != null) {
                transaction.rollback();
            }
            ss.close();
        }
    }
}
