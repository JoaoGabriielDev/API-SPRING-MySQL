package com.challenge.carsales.service;

import com.challenge.carsales.entitie.Pedido;
import com.challenge.carsales.repositorie.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService{

    @Autowired
    private PedidoRepository pedidoRepository;

    @Override
    public Optional<Pedido> findById(Long id){
        return pedidoRepository.findById(id);
    }
}
