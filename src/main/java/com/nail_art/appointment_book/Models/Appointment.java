package com.nail_art.appointment_book.Models;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "Appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointmentId")
    private int appointmentId;

    @Column(name = "name")
    private String name;

    @Column(name = "phoneNumber")
    @Pattern(regexp = "^(\\+\\d{1,2}\\s?)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$", message = "Not a valid phone number")
    private String phoneNumber;

    @Column(name = "employeeId")
    private int employeeId;

    @Column(name = "serviceId")
    private int serviceId;

    @Column(name = "date")
    private String date;

    @Column(name = "startTime")
    private String startTime;

    @Column(name = "endTime")
    private String endTime;
}
