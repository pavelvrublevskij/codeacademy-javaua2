package eu.codeacademy.hibernate2.examples;

import eu.codeacademy.hibernate2.dao.EmployeeDao;
import eu.codeacademy.hibernate2.helper.DaoManagerHelper;
import eu.codeacademy.hibernate2.pojo.EmployeePojo;
import eu.codeacademy.hibernate2.service.EmployeeService;
import org.hibernate.Session;

public class DaoExample {

    public static void main(String[] args) {
        try(Session ss = DaoManagerHelper.getSession()) {
            EmployeeDao employeeDao = new EmployeeDao(ss, EmployeePojo.class);
            EmployeeService employeeService = new EmployeeService(employeeDao);
            // fetch all employee data
            System.out.println("--------- FETCH EMPLOYEE DATA -------------");
            employeeService.getAll().stream()
                    .forEach(System.out::println);
        }
    }
}
