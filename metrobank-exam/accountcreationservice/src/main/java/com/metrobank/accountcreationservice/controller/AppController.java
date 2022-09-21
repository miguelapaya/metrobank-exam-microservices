package com.metrobank.accountcreationservice.controller;

import com.metrobank.accountcreationservice.entity.CustomerAccount;
import com.metrobank.accountcreationservice.model.AccountDetails;
import com.metrobank.accountcreationservice.model.RequiredResponse;
import com.metrobank.accountcreationservice.repository.CustomerAccountRepository;
import com.metrobank.accountcreationservice.service.CustomerAccountService;
import com.metrobank.accountcreationservice.validation.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class AppController {

    @Autowired
    private CustomerAccountService customerAccountService;

    @Autowired
    private CustomerAccountRepository accountRepository;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/get")
    public ResponseEntity<String> test(){
        return new ResponseEntity<>("hello", HttpStatus.OK);
    }

    /*@GetMapping("/account/{id}")
    public ResponseEntity<Object> getByCustomerId(@PathVariable Integer id){

        List<CustomerAccount> customerAccountList = customerAccountService.getAccountById(id);
        return new ResponseEntity<>(customerAccountList, HttpStatus.OK);
    }*/

    @PostMapping("/account")
    public ResponseEntity<Response> saveCustomer(@Valid @RequestBody CustomerAccount customerAccount){

        CustomerAccount account = customerAccountService.saveAccount(customerAccount);
        return new ResponseEntity<>(new Response(account, "201", "Customer Accounte created!"), HttpStatus.CREATED);

    }


    @GetMapping("/accounts/{id}")
    public ResponseEntity<RequiredResponse> getAllDataBasedOnId(@PathVariable Integer id){
        RequiredResponse requiredResponse = new RequiredResponse();
        CustomerAccount customerAccount = accountRepository.findById(id).get();
        requiredResponse.setCustomerAccount(customerAccount);

        List<AccountDetails> listOfAccountDetails = restTemplate.getForObject("http://localhost:8082/api/v1/accounts/" + id, List.class);

        requiredResponse.setAccountDetails(listOfAccountDetails);
        return new ResponseEntity<RequiredResponse>(requiredResponse, HttpStatus.OK);


    }

}
