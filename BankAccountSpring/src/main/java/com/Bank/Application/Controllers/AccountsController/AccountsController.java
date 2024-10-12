package com.Bank.Application.Controllers.AccountsController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Application.Entities.DTO.AccountDTO;
import com.Bank.Application.Services.AccountsServices.AccountsServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/accounts")
public class AccountsController {


    @Autowired
    AccountsServicesImpl accountsServices;

    @PostMapping("/create")
    public void createAccount(@RequestBody AccountDTO account ) {
        accountsServices.createAccount(account);
    

    }
    

}
