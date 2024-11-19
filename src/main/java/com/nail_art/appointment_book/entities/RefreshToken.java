package com.nail_art.appointment_book.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Document(collection = "RefreshToken")
public class RefreshToken {
    @Id
    private String _id;

    private String token;

    private String username;

    private Instant expiryDate;
}
