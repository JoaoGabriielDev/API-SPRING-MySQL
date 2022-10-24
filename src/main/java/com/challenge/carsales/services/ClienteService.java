package com.challenge.carsales.services;

import com.challenge.carsales.entities.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    List<Cliente> listCliente();

    Optional<Cliente> findById(Long id);

    Optional<Cliente> deleteCliente (Cliente cliente, Long id);

    Cliente createCliente(Cliente cliente);

    Optional<Cliente> updateCliente(Cliente cliente, Long id);

}
