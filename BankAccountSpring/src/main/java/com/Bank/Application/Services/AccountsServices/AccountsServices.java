package com.Bank.Application.Services.AccountsServices;

import org.springframework.stereotype.Service;

import com.Bank.Application.Entities.DTO.AccountDTO;

@Service
public interface AccountsServices {

    public void createAccount(AccountDTO account);




}
