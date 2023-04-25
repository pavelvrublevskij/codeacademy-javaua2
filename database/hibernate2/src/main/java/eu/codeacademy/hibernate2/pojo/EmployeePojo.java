package eu.codeacademy.hibernate2.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
@Data
public class EmployeePojo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // IDENTITY because postgresql
    private Long id;

    private String name;
    private String surname;
}
