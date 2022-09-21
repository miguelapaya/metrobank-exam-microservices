package com.metrobank.accountcreationservice.validation;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class ValidationHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {


        List<Response> errors = new ArrayList<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {

            Response response = new Response();
            response.setTransactionStatusCode(status.toString());
            response.setTransactionDescription(error.getDefaultMessage());
            errors.add(response);

        });

        return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
    }
}
