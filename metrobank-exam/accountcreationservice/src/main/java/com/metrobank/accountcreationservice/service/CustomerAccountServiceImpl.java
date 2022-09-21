package com.metrobank.accountcreationservice.service;

import com.metrobank.accountcreationservice.entity.CustomerAccount;
import com.metrobank.accountcreationservice.repository.CustomerAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerAccountServiceImpl implements CustomerAccountService{

    @Autowired
    private CustomerAccountRepository customerAccountRepository;

    @Override
    public CustomerAccount saveAccount(CustomerAccount customerAccount) {
        return customerAccountRepository.save(customerAccount);
    }

    @Override
    public List<CustomerAccount> getAccountById(Integer id) {
        return customerAccountRepository.findByAccountId(id);
    }
}
