package com.Bank.Application.Services.FacturasServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Bank.Application.Entities.DTO.FacturaDTO;
import com.Bank.Application.Entities.DTO.UserDTO;
import com.Bank.Application.Repositories.AccountRepository.AccountsRepository;
import com.Bank.Application.Repositories.FacturasRepository.FacturasRepository;
import com.Bank.Application.Repositories.UsersRepository.UsersRepository;

import java.util.Optional;
import java.util.List;

import com.Bank.Application.Entities.Account;
import com.Bank.Application.Entities.Factura;
import com.Bank.Application.Entities.User;


@Service
public class FacturasServicesImpl implements FacturasServices {


    @Autowired
    AccountsRepository accountsRepository;

    @Autowired
    FacturasRepository facturasRepository;

    @Autowired
    UsersRepository usersRepository;

    
    @Override
    public boolean addFactura(FacturaDTO factura){


        Optional<User> user = usersRepository.findByEmail(factura.getRelatedEmail());

        if(user.isPresent()){
            Optional<Account> relatedAccountUser =  accountsRepository.findByOwner(user.get());

            if(relatedAccountUser.isPresent()){
                facturasRepository.save(new Factura(factura.getSource(), factura.getConcept(), factura.getAmount(), factura.getCreationDate(), factura.getKeyValue(), relatedAccountUser.get()));
                return true;

            }



        }
        return false;







    }
    @Override
    public List<Factura> getFacturas(UserDTO user){

        Optional<User> usr = usersRepository.findByEmail(user.getEmail());


        if(usr.isPresent()){
            Optional<Account> relatedAccountUser =  accountsRepository.findByOwner(usr.get());

            if(relatedAccountUser.isPresent()){
                return facturasRepository.findByAccount(relatedAccountUser.get());

            }



        }










        return null;

    }

}
