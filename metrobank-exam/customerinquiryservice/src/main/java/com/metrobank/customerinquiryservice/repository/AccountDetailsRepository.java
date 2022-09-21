package com.metrobank.customerinquiryservice.repository;

import com.metrobank.customerinquiryservice.model.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Integer> {

    @Query("SELECT a FROM AccountDetails a WHERE a.id = ?1 ")
    List<AccountDetails> findByAccountDetailsId(Integer id);


}
