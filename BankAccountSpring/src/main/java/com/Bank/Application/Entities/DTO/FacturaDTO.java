package com.Bank.Application.Entities.DTO;


import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class FacturaDTO {


    private Integer id;
    private Date creationDate;
    private String source;
    private String concept;
    private Double iva;
    private Double amount;
    private String keyValue;
     private String relatedEmail;

    public FacturaDTO(String source,String concept, Double amount, Date creationDate, String keyValue, String relatedEmail){
        this.source=source;
        this.concept=concept;
        this.amount=amount;
        this.creationDate = creationDate;
        this.keyValue = keyValue;
        this.relatedEmail = relatedEmail;
    }

    

    

}
