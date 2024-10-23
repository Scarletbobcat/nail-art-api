package com.nail_art.appointment_book.Controllers;

import com.nail_art.appointment_book.Models.User;
import com.nail_art.appointment_book.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/Users/{username}")
    public ResponseEntity<User> getUser(@PathVariable String username) {
        User tempUser = userService.findUserByUsername(username);
        return new ResponseEntity<>(tempUser, HttpStatus.OK);
    }

    @PostMapping("/Users/Create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User tempUser = userService.createUser(user);
        return new ResponseEntity<>(tempUser, HttpStatus.CREATED);
    }


}
