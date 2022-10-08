package com.challenge.carsales.service;

import com.challenge.carsales.entitie.Car;
import com.challenge.carsales.entitie.Cliente;

import java.util.Optional;

public interface ClienteService {

    Optional<Cliente> findById(Long id);
}
