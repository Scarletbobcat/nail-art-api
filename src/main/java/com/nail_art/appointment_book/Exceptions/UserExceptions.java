package com.nail_art.appointment_book.Exceptions;

public class UserExceptions {
    // if there is already a user with that username
    public static class UserAlreadyExistsException extends RuntimeException {
        public UserAlreadyExistsException(String message) {
            super(message);
        }
    }

    // not found
    public static class UserNotFoundException extends RuntimeException {
        public UserNotFoundException(String message) {
            super(message);
        }
    }
}
