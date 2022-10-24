package com.challenge.carsales.services;

import com.challenge.carsales.entities.Pedido;

import java.util.List;
import java.util.Optional;

public interface PedidoService {

    List<Pedido> listPedido();

    Optional<Pedido> findById(Long id);

    Optional<Pedido> deletePedido(Pedido pedido, Long id);

    Pedido createPedido(Pedido pedido);

    Pedido updatePedido(Pedido pedido, Long id);

    List<Pedido> findByClient(Long id);
}
