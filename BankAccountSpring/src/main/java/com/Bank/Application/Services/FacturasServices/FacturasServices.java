package com.Bank.Application.Services.FacturasServices;

import org.springframework.stereotype.Service;

import com.Bank.Application.Entities.Factura;
import com.Bank.Application.Entities.DTO.FacturaDTO;
import com.Bank.Application.Entities.DTO.UserDTO;
import java.util.List;
@Service
public interface FacturasServices {

     public boolean addFactura(FacturaDTO factura);

     public List<Factura> getFacturas(UserDTO user);


}
