package com.Bank.Application.Services.UserServices;

import org.springframework.stereotype.Service;

import com.Bank.Application.Entities.DTO.UserDTO;
@Service
public interface UserServices {

    public boolean createUser(UserDTO user);

    public UserDTO logIn(UserDTO user);
    
    

}
