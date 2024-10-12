package com.Bank.Application.Services.PaymentServices;

import org.springframework.stereotype.Service;

import com.Bank.Application.Entities.DTO.PaymentDTO;



@Service
public interface PaymentsServices {

    public boolean validatePayment(PaymentDTO payment);

}
