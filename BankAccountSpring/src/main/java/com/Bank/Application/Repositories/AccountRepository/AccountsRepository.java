package com.Bank.Application.Repositories.AccountRepository;

import com.Bank.Application.Entities.Account;
import com.Bank.Application.Entities.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountsRepository extends JpaRepository<Account,Long> {


    Optional<Account> findByOwner(User owner);




}
