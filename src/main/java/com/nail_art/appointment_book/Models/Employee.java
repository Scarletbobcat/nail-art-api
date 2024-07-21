package com.nail_art.appointment_book.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_ID")
    private int employeeID;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;
}
