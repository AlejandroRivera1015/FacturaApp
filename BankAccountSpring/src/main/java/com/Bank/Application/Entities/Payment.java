package com.Bank.Application.Entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


import java.util.ArrayList;

import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator;




@Entity
@Getter
@Setter
@Table(name = "Payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double amount;
    private String productOrService;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "card_id")
    private Card card ;

    public Payment(Double amount, String productOrService, Card paymentCard){
        this.amount = amount;
        this.productOrService = productOrService;
        this.card = paymentCard;
        //this.key = UUID.randomUUID();
    }

    

}
