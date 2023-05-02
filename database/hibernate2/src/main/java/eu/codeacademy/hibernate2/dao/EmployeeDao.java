package eu.codeacademy.hibernate2.dao;

import eu.codeacademy.hibernate2.pojo.EmployeeTypePojo;
import org.hibernate.Session;

public class EmployeeDao extends GenericDao<EmployeeTypePojo> {

    public EmployeeDao(Session session, Class<EmployeeTypePojo> entityClass) {
        super(session, entityClass);
    }
}
