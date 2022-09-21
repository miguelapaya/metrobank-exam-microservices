package com.metrobank.customerinquiryservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class AccountDetails {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String accountyType;

    @Column
    private int availableBalance;
}
