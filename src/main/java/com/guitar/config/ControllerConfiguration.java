package com.guitar.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class ControllerConfiguration {

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="Invalid Data Sent to Server")
    public void notValid()
    {
        //you can add code which you want to execute
    }
}
