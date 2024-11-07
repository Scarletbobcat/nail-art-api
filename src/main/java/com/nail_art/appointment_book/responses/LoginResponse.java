package com.nail_art.appointment_book.responses;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;

    private long expiresIn;
}