package com.metrobank.accountcreationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class CustomerAccount {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Customer Name should not be empty!")
    @Column
    private String customerName;

    @NotEmpty(message = "Customer Mobile Number should not be empty!")
    @Column
    private String customerMobile;

    @NotEmpty(message = "Email should not be empty!")
    @Email(message = "Invalid Email!")
    @Column
    private String customerEmail;

    @NotEmpty(message = "Address1 should not be empty!")
    @Column
    private String address1;

    @NotEmpty(message = "Address2 should not be empty!")
    @Column
    private String address2;

    @NotNull(message = "AccountID should not be empty!")
    @Column
    private int accountId;

}
