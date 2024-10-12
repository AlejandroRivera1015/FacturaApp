package com.Bank.Application.Entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String name;
    public Date creationDate;



    public User(String email, String password){
        this.email=email;
        this.password=password;
    }

    public User(String email, String password,String name, Date date){
        this.email=email;
        this.password=password;
        this.name=name;
        this.creationDate = date;
    }





    
}
