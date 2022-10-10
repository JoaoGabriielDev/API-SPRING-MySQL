package com.challenge.carsales.service;

import com.challenge.carsales.entitie.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    List<Cliente> listCliente();

    Optional<Cliente> findById(Long id);

    Optional<Cliente> deleteCliente (Cliente cliente, Long id);

    Cliente createCliente(Cliente cliente);

}
