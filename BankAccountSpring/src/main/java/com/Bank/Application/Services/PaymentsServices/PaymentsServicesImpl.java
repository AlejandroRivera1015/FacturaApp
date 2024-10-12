package com.Bank.Application.Services.PaymentsServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.Application.Entities.Card;
import com.Bank.Application.Entities.DTO.PaymentDTO;
import com.Bank.Application.Repositories.CardsRepository.CardsRepository;
import com.Bank.Application.Services.PaymentServices.PaymentsServices;


@Service
public class PaymentsServicesImpl implements PaymentsServices {

    @Autowired
    CardsRepository cardsRepository;
    
    @Override
    public  boolean validatePayment(PaymentDTO payment){

       List<Card> relatedCards = cardsRepository.findByNumberAndPassCode(payment.getCard().getNumber(), payment.getCard().getPassCode());
        System.out.println(relatedCards);
    
        
        return false;
    }

}
