package com.nail_art.appointment_book.Exceptions;

import org.springframework.http.HttpStatus;
import com.nail_art.appointment_book.Exceptions.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserExceptions.UserAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> handleUserAlreadyExists(UserExceptions.UserAlreadyExistsException ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.CONFLICT.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UserExceptions.UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleUserNotFound(UserExceptions.UserNotFoundException ex) {
        ErrorResponse errorResponse = new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
