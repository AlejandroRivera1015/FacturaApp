package com.Bank.Application.Entities.DTO;


import  java.util.ArrayList;
import java.util.List;

import com.Bank.Application.Entities.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
public class AccountDTO {

    private Long accountNumber;
    private Double accountBalance;
    private List<CardDTO> cards = new ArrayList<>();
    private String accountEmail;
    private String accountPswd;


    public AccountDTO(Long accountNumber, Double accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;

    }


    public AccountDTO(Long accountNumber, Double accountBalance, String accountEmail, String accountPswd){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountEmail = accountEmail;
        this.accountPswd = accountPswd;

    }


    
}
