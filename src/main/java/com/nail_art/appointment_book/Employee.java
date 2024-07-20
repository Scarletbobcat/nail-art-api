package com.nail_art.appointment_book;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

@Entity
@Data
@Table(name = "Employees")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "EMPLOYEE_ID")
    private int employeeID;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;
}
