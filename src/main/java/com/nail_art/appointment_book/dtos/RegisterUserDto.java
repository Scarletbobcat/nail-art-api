package com.nail_art.appointment_book.dtos;

import lombok.Data;

@Data
public class RegisterUserDto {
    private String email;

    private String password;

    private String username;

    public String getEmail() {
        return email;
    }
}