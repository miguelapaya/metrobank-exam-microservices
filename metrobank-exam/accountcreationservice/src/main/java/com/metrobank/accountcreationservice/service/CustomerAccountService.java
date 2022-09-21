package com.metrobank.accountcreationservice.service;

import com.metrobank.accountcreationservice.entity.CustomerAccount;

import java.util.List;

public interface CustomerAccountService {

    CustomerAccount saveAccount(CustomerAccount customerAccount);
    List<CustomerAccount> getAccountById(Integer id);


}
