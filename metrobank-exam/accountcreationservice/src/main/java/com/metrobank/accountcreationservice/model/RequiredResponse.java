package com.metrobank.accountcreationservice.model;

import com.metrobank.accountcreationservice.entity.CustomerAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data @AllArgsConstructor @NoArgsConstructor
public class RequiredResponse {

    private CustomerAccount customerAccount;
    private List<AccountDetails> accountDetails;
}
