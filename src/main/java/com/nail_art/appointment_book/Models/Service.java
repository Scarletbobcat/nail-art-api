package com.nail_art.appointment_book.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Services")
public class Service {
    @Id
    private String _id;

    private int id;

    private String name;
}
