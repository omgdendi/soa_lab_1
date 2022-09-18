package com.omgdendi.soa_lab_1.controller.handler.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = {
            Exception.class
    })
    public ResponseEntity<?> handleAllExceptions(Exception ex, WebRequest request) {
        return ResponseEntity.internalServerError().body("Произошла ошибка");
    }
}
