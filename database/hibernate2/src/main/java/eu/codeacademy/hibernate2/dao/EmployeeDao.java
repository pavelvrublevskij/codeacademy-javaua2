package eu.codeacademy.hibernate2.dao;

import eu.codeacademy.hibernate2.pojo.EmployeePojo;
import org.hibernate.Session;

public class EmployeeDao extends GenericDao<EmployeePojo> {

    public EmployeeDao(Session session, Class<EmployeePojo> entityClass) {
        super(session, entityClass);
    }
}
