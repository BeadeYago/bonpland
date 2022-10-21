package com.bonpland.inmobilaria.handler;

import com.bonpland.inmobilaria.dto.ErrorDto;
import com.bonpland.inmobilaria.exception.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorDto> ShippingNotFound(EntityNotFoundException ex) {
        return new ResponseEntity<>(new ErrorDto(ex.getMessage()), HttpStatus.NOT_FOUND);
    }
}
