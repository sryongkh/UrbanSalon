package com.urbansalon.exception;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.urbansalon.payload.response.ExceptionResponse;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> ExceptionHandler(Exception ex, WebRequest req) {
        ExceptionResponse response = new ExceptionResponse(ex.getMessage(), "Error", LocalDateTime.now());
        return ResponseEntity.ok(response);
    }
}
