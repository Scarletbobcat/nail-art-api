package com.nail_art.appointment_book.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Services")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SERVICES_ID")
    private int servicesId;

    @Column(name = "SERVICE_NAME")
    private String serviceName;
}
