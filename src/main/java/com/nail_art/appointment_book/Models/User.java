package com.nail_art.appointment_book.Models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="Users")
public class User {
    @Id
    private String _id;

    private int id;

    @Indexed(unique = true)
    private String username;

    private String password;

    private String email;
}
