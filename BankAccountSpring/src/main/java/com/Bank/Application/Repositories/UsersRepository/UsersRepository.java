package com.Bank.Application.Repositories.UsersRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bank.Application.Entities.User;

@Repository
public interface UsersRepository extends JpaRepository<User,Long> {

    public Optional<User> findByEmailAndPassword(String email, String password);
    public Optional<User> findByEmail(String email);

    








}
