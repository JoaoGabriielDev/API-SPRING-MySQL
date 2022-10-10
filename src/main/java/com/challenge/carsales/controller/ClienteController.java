package com.challenge.carsales.controller;

import com.challenge.carsales.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente/")
public class ClienteController {

    @Autowired
     private ClienteService clienteService;

}
