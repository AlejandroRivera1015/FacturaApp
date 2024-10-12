package com.Bank.Application.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number")
    private Long number;
    @Column(name = "passCode")
    private Integer passCode;
    @Column(name = "balance")
    private Double balance;
    @Column(name = "cardType")
    private String cardType;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Card(Long number, Integer passCode){
        this.number = number;
        this.passCode = passCode;

    }


}
