package com.metrobank.customerinquiryservice.service;

import com.metrobank.customerinquiryservice.model.AccountDetails;

import java.util.List;

public interface AccountDetailsService {

    AccountDetails save(AccountDetails accountDetails);
    List<AccountDetails>getAccountById(Integer id);
}
