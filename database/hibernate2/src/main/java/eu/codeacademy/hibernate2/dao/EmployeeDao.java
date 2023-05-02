package eu.codeacademy.hibernate2.dao;

import eu.codeacademy.hibernate2.pojo.EmployeePojo;
import jakarta.persistence.Query;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

public class EmployeeDao {

    private final Session session;

    public EmployeeDao(Session session) {
        this.session = session;
    }

    public List<EmployeePojo> getAll() {
        return session.createQuery("FROM EmployeePojo", EmployeePojo.class).list();
    }

    public Optional<EmployeePojo> getById(Long id) {
        return Optional.ofNullable(session.get(EmployeePojo.class, id));
    }

    public void saveOrUpdate(EmployeePojo pojo) {
        session.persist(pojo);
    }

    public void delete(Long id) {
        getById(id).ifPresent(session::remove);
    }

}
