package com.nail_art.appointment_book.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeId")
    private int employeeID;

    @Column(name = "employeeName")
    private String employeeName;
}
