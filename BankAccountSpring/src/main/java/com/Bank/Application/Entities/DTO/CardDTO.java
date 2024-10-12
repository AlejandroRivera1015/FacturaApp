package com.Bank.Application.Entities.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class CardDTO {
    private Long number;
    private Integer passCode;



}
