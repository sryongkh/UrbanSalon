package com.urbansalon.payload.response;

import lombok.Getter;
import java.time.LocalDateTime;

@Getter
public class ExceptionResponse {
    private String message;
    private String error;
    private LocalDateTime timestamp;

    public ExceptionResponse(String message, String error, LocalDateTime timestamp) {
        this.message = message;
        this.error = error;
        this.timestamp = timestamp;
    }
}
