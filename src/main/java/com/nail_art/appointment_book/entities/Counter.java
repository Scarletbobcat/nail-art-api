package com.nail_art.appointment_book.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Counters")
public class Counter {
    @Id
    private String _id;

    private int sequence;

    private String collectionName;

    public Counter (int sequence, String collectionName) {
        this.sequence = sequence;
        this.collectionName = collectionName;
    }
}
