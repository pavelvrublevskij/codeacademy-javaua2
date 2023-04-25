package eu.codeacademy.hibernate2.pojo;

import jakarta.persistence.Column;
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

    @Column(length = 30, nullable = false)
    private String name;

    @Column(length = 50, nullable = false)
    private String surname;

    @Column(length = 30)
    private String email;

    @Column(name="phone_number", length = 8)
    private String phoneNumber;
}
