package eu.codeacademy.hibernate2.dao;

import eu.codeacademy.hibernate2.pojo.EmployeePojo;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class EmployeeDao {

    private final Session session;

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
