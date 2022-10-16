package com.challenge.carsales.service;

import com.challenge.carsales.entitie.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {

    List<Pedido> listPedido();

    Optional<Pedido> findById(Long id);

}
