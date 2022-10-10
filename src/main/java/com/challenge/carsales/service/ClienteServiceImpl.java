package com.challenge.carsales.service;

import com.challenge.carsales.entitie.Cliente;
import com.challenge.carsales.repositorie.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
     private ClienteRepository clienteRepository;

    @Override
     public Optional<Cliente> findById(Long id){
       return clienteRepository.findById(id);
   }

    @Override
     public Optional<Cliente> deleteCliente (Cliente cliente, Long id){
        Optional<Cliente> clienteDelete = findById(id);
        clienteRepository.delete(clienteDelete.get());
        return clienteDelete;
     }

     public Cliente createCliente(Cliente cliente){
        return clienteRepository.save(cliente);
     }





}
