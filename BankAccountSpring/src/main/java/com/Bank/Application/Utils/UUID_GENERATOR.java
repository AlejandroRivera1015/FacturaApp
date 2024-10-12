package com.Bank.Application.Utils;

import java.util.UUID;

import lombok.Getter;


@Getter
public class UUID_GENERATOR {

    
    private UUID  uuid;


    public UUID getUuid(){
        return  this.uuid;
    }


    public UUID_GENERATOR(){
        this.uuid = UUID.randomUUID();
    }


}
