package com.metrobank.customerinquiryservice.service;

import com.metrobank.customerinquiryservice.model.AccountDetails;
import com.metrobank.customerinquiryservice.repository.AccountDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountDetailsServiceImpl implements AccountDetailsService{

    @Autowired
    private AccountDetailsRepository accountDetailsRepository;

    @Override
    public AccountDetails save(AccountDetails accountDetails) {
        return accountDetailsRepository.save(accountDetails);
    }

    @Override
    public List<AccountDetails> getAccountById(Integer id) {
        return accountDetailsRepository.findByAccountDetailsId(id);
    }
}
