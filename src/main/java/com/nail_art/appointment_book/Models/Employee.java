package com.nail_art.appointment_book.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Employees")
public class Employee {
    @Id
    private String _id;

    private int id;

    private String name;

    private String color;
}
