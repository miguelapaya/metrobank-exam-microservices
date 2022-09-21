package com.metrobank.accountcreationservice.validation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.metrobank.accountcreationservice.entity.CustomerAccount;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Response {
    @JsonProperty("account")
    private CustomerAccount account;

    @JsonProperty("transactionStatusCode")
    private String transactionStatusCode;

    @JsonProperty("transactionDescription")
    private String transactionDescription;

    public Response(){

    }
    public Response(String transactionStatusCode, String transactionDescription) {
        super();
        this.transactionStatusCode = transactionStatusCode;
        this.transactionDescription = transactionDescription;
    }

    public Response(CustomerAccount account, String transactionStatusCode, String transactionDescription) {
        super();
        this.account = account;
        this.transactionStatusCode = transactionStatusCode;
        this.transactionDescription = transactionDescription;
    }
}
