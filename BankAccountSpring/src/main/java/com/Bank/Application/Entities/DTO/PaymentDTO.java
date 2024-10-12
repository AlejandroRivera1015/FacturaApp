package com.Bank.Application.Entities.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PaymentDTO {

private Double amount;
private String productOrService;
private CardDTO card;




}
