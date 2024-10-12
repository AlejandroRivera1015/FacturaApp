package com.Bank.Application.Controllers.PaymentsController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Application.Entities.DTO.PaymentDTO;
import com.Bank.Application.Services.PaymentsServices.PaymentsServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/payment")
public class PaymentsController {

    @Autowired
    PaymentsServicesImpl paymentsServices;


    @PostMapping("/get")
    public void getPayment(@RequestBody PaymentDTO payment){
        paymentsServices.validatePayment(payment);
        
        
    }
   
}
