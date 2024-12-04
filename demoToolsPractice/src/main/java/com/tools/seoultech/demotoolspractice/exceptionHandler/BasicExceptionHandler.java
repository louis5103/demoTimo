package com.tools.seoultech.demotoolspractice.exceptionHandler;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Optional;

@ControllerAdvice
public class BasicExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleException(Exception e) {
        Throwable throwable = new Throwable(e.getMessage());
        ErrorResponse response = ErrorResponse.builder(
                    throwable,
                    HttpStatusCode.valueOf(500),
                    e.getMessage()
                )
                .build();
        System.err.println(response.getBody());
        return ResponseEntity.of(Optional.of(response));

    }
}
