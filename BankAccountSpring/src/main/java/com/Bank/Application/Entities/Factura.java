package com.Bank.Application.Entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
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

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Facturas")

public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "creationDate")
    private Date creationDate;
    @Column(name = "source")
    private String source;
    @Column(name = "concept")
    private String concept;
    @Column(name = "iva")
    private Double iva;
    @Column(name = "amount")
    private Double amount;

    @Column(name = "keyVal")
    private String keyVal;

    @Column(name ="status")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "account_id")
    @JsonIgnore

    private Account account;

    public Factura(String source,String concept, Double amount, Date creationDate, String keyVal,Account account){
        this.source=source;
        this.concept=concept;
        this.amount=amount;
        this.creationDate = creationDate;
        this.keyVal = keyVal;
        this.account = account;


    }





}
