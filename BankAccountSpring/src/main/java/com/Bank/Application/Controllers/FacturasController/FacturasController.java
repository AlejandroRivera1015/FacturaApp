package com.Bank.Application.Controllers.FacturasController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.Application.Entities.DTO.FacturaDTO;
import com.Bank.Application.Entities.DTO.UserDTO;
import com.Bank.Application.Entities.Factura;


import com.Bank.Application.Services.FacturasServices.FacturasServicesImpl;
import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturasController {

    @Autowired
    FacturasServicesImpl facturasServices;

    @PostMapping("/create")
    public boolean facturaRequest(@RequestBody FacturaDTO factura) {
        System.out.println(factura);
        return facturasServices.addFactura(factura);

    }

    @PostMapping("/search")
    public List<Factura> getFacturas(@RequestBody UserDTO user) {
        return facturasServices.getFacturas(user);

    }
}
