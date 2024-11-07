package com.nail_art.appointment_book.Services;

import com.mongodb.DuplicateKeyException;
import com.nail_art.appointment_book.Models.User;
import com.nail_art.appointment_book.Repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nail_art.appointment_book.Exceptions.UserExceptions;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);
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

    public List<User> allUsers() {
        List<User> users = userRepository.findAll();
        log.info("Fetched users: {}", users);
        return users;
    }
}
