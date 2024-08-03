package com.nail_art.appointment_book.Models;

import org.springframework.data.annotation.Id;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "Appointments")
public class Appointment {
    @Id
    private String _id;

    private int id;

    private String name;

    private int employeeId;

    private String phoneNumber;

    private String startTime;

    private String endTime;

    private String date;

    private List<String> services;
}
