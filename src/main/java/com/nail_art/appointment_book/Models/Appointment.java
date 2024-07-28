package com.nail_art.appointment_book.Models;

import jakarta.persistence.*;
import lombok.Data;
import jakarta.validation.constraints.*;
import java.time.LocalDateTime;

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

    @Column(name = "startDate")
    private LocalDateTime startDate;

    @Column(name = "endDate")
    private LocalDateTime endDate;
}
