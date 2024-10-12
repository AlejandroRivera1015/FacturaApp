package com.Bank.Application.Repositories.CardsRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Bank.Application.Entities.Card;
import java.util.List;


public interface CardsRepository extends JpaRepository<Card,Long> {


    public List<Card> findByNumberAndPassCode(Long number, Integer passCode);
}
