package eu.codeacademy.hibernate2.dao;

import eu.codeacademy.hibernate2.pojo.EmployeeTypePojo;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class EmployeeTypeDao {

    private final Session session;

    public List<EmployeeTypePojo> getAll() {
        return session.createQuery("FROM EmployeeTypePojo", EmployeeTypePojo.class).list();
    }

    public Optional<EmployeeTypePojo> getById(Long id) {
        return Optional.ofNullable(session.get(EmployeeTypePojo.class, id));
    }

    public void saveOrUpdate(EmployeeTypePojo pojo) {
        session.persist(pojo);
    }

    public void delete(Long id) {
        getById(id).ifPresent(session::remove);
    }
}
