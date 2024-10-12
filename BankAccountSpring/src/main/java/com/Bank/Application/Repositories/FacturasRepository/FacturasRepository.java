package com.Bank.Application.Repositories.FacturasRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Bank.Application.Entities.Account;
import com.Bank.Application.Entities.Factura;
import java.util.List;



@Repository
public interface FacturasRepository extends JpaRepository<Factura,Long>{


    List<Factura> findByAccount(Account account);

}
