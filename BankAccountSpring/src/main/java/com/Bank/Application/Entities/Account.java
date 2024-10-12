package com.Bank.Application.Entities;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor 


@Table(name = "Accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id")
    private User owner;

    private Long accountNumber;
    private Double accountBalance;

    private String keyValue;


    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Card> cards = new ArrayList<>();


    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Factura> facturas = new ArrayList<>();


    public Account(Long accountNumber, Double accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        
    }

    public Account(Long accountNumber, Double accountBalance, User owner){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.owner = owner;
        
    }

 
}
