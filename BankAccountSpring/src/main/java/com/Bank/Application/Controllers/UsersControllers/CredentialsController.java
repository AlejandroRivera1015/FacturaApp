package com.Bank.Application.Controllers.UsersControllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/credentials")
public class CredentialsController {

    @PostMapping("logIn")
    public Boolean postMethodName(@RequestBody String entity) {

        
        return false;
    }
    





}
