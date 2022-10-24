package com.challenge.carsales.services;

import com.challenge.carsales.entities.Cliente;
import com.challenge.carsales.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
     private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listCliente(){
        return clienteRepository.findAll();
    }

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

     @Override
     public Cliente createCliente(Cliente cliente)      {
        return clienteRepository.save(cliente);
     }

     @Override
     public Optional<Cliente> updateCliente(Cliente cliente, Long id){
        Optional<Cliente> clienteUpdate = findById(id);

              clienteUpdate.get().setName(cliente.getName());
              clienteUpdate.get().setCpf(cliente.getCpf());
              clienteUpdate.get().setEmail(cliente.getEmail());
              clienteUpdate.get().setTelefone(cliente.getTelefone());
              clienteUpdate.get().setEndereco(cliente.getEndereco());
              clienteUpdate.get().setBairro(cliente.getBairro());
              clienteUpdate.get().setCep(cliente.getCep());
              clienteUpdate.get().setCidade(cliente.getCidade());
              clienteUpdate.get().setEstado(cliente.getEstado());

              Cliente clienteSaved = clienteRepository.save(clienteUpdate.get());

             return Optional.of(clienteSaved);
     }
}
