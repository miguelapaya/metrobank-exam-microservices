package com.metrobank.customerinquiryservice.controller;

import com.metrobank.customerinquiryservice.model.AccountDetails;
import com.metrobank.customerinquiryservice.service.AccountDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AppController {

    @Autowired
    private AccountDetailsService accountDetailsService;


    @GetMapping("/get")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

    @PostMapping("/accounts")
    public ResponseEntity<?> saveAccountDetails( @RequestBody AccountDetails accountDetails){

        return new ResponseEntity<>(accountDetailsService.save(accountDetails), HttpStatus.CREATED);
    }

    @GetMapping("/accounts/{id}")
    public ResponseEntity<Object> getByCustomerId(@PathVariable Integer id){

        List<AccountDetails> accountDetails = accountDetailsService.getAccountById(id);
        return new ResponseEntity<>(accountDetails, HttpStatus.OK);
    }


}
