package com.Bank.Application.Entities.DTO;

import java.sql.Date;
import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private Integer id;
    private String email;
    private String name;
    private String password;
    private UUID token;

    public UserDTO(String email, String password){
        this.email = email;
        this.password = password;
    }

    public UserDTO(String email, String name){
        this.email = email;
        this.name = name;
    }

    public UserDTO(String email){
        this.email = email;
    }




}

