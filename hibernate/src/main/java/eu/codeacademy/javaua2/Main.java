package eu.codeacademy.javaua2;

import eu.codeacademy.javaua2.model.Student;
import eu.codeacademy.javaua2.util.HibernateUtil;
import eu.codeacademy.javaua2.util.JdbcUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    static final String QUERY = "SELECT id, vardas, pavarde, kursas, vidurkis FROM Studentas";

    public static void main(String[] args) {

        try(
                Connection conn = JdbcUtil.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
        ) {
            while(rs.next()){
                //Display values
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", vardas: " + rs.getString("vardas"));
                System.out.print(", pavarde: " + rs.getString("pavarde"));
                System.out.println(", kursas: " + rs.getInt("kursas"));
                System.out.println(", vidurkis: " + rs.getDouble("vidurkis"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}