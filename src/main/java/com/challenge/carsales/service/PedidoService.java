package com.challenge.carsales.service;

import com.challenge.carsales.entitie.Pedido;

import java.util.Optional;

public interface PedidoService {

    Optional<Pedido> findById(Long id);

}
