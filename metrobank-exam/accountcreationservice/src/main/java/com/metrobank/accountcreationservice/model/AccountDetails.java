package com.metrobank.accountcreationservice.model;

import lombok.Data;

@Data
public class AccountDetails {

    private int id;
    private String accountType;
    private int availableBalance;
}
