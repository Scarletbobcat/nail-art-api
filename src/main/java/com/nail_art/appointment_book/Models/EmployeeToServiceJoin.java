package com.nail_art.appointment_book.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "EmployeeToServiceJoin")
public class EmployeeToServiceJoin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    @Column(name = "EMPLOYEE_ID")
    private Employee employeeID;

    @ManyToOne
    @Column(name = "SERVICE_ID")
    private Service serviceID;
}
