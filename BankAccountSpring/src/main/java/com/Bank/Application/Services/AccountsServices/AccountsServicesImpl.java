package com.Bank.Application.Services.AccountsServices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.Application.Entities.Account;
import com.Bank.Application.Entities.User;
import com.Bank.Application.Entities.DTO.AccountDTO;
import com.Bank.Application.Repositories.AccountRepository.AccountsRepository;
import com.Bank.Application.Repositories.UsersRepository.UsersRepository;

@Service
public class AccountsServicesImpl  implements AccountsServices{


    @Autowired
    AccountsRepository accountsRepository;
    
    @Autowired
    UsersRepository usersRepository;

    @Override
    public void createAccount(AccountDTO accountDTO){

        Optional<User> relatedUser = usersRepository.findByEmailAndPassword(accountDTO.getAccountEmail(), accountDTO.getAccountPswd()) ;
        Optional<Account> relatedAccount = ;
        
        if(relatedUser.isPresent()){
            User usr = relatedUser.get();
            accountsRepository.save(new Account(accountDTO.getAccountNumber(), accountDTO.getAccountBalance(), usr));
        
            
        }
        
        
        

    }
}
