package com.nail_art.appointment_book.Services;

import com.mongodb.DuplicateKeyException;
import com.nail_art.appointment_book.Models.User;
import com.nail_art.appointment_book.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nail_art.appointment_book.Exceptions.UserExceptions;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        try {
            if (userRepository.findByUsername(user.getUsername()) != null) {
                throw new UserExceptions.UserAlreadyExistsException(
                        "User with username '" + user.getUsername() + "' already exists."
                );
            }
            user.setId((int) userRepository.count() + 1);
            return userRepository.save(user);
        } catch (Exception e) {
            throw e;
        }
    }

    public User findUserByUsername(String username) {
        try{
            User tempUser = userRepository.findByUsername(username);
            if (tempUser == null) {
                throw new UserExceptions.UserNotFoundException(
                        "User with username '" + username + "' not found."
                );
            }
            return tempUser;
        } catch (Exception e){
            throw e;
        }
    }
}
