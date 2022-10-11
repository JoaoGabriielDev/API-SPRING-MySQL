package com.challenge.carsales.controller;

import com.challenge.carsales.entitie.Cliente;
import com.challenge.carsales.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente/")
public class ClienteController {

    @Autowired
     private ClienteService clienteService;


    @GetMapping(value = "listarClientes")
    @ResponseBody
    public ResponseEntity<List<Cliente>> listCliente(){
        List<Cliente> cliente = clienteService.listCliente();
        return new ResponseEntity<List<Cliente>>(cliente, HttpStatus.OK);
    }


}
