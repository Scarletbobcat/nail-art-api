package com.nail_art.appointment_book.Repositories;

import com.nail_art.appointment_book.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
}
