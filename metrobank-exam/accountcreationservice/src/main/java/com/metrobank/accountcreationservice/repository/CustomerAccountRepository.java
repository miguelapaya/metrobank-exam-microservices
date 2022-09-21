package com.metrobank.accountcreationservice.repository;

import com.metrobank.accountcreationservice.entity.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CustomerAccountRepository extends JpaRepository<CustomerAccount, Integer> {

    public List<CustomerAccount> findByAccountId(Integer id);
}
