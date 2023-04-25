package eu.codeacademy.hibernate2.helper;

import eu.codeacademy.hibernate2.pojo.EmployeePojo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class DaoManagerHelper {

    public static SessionFactory getSessionFactory() {
        Configuration cfg = HibernateConfigurationHelper.iniConfigurationPostgreSQL();
        cfg.addAnnotatedClass(EmployeePojo.class);

        return cfg.buildSessionFactory();
    }

    public static Session getSession() {
        return getSessionFactory().openSession();
    }


}
