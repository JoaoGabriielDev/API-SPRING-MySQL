package com.challenge.carsales.services;

import com.challenge.carsales.entities.Pedido;
import com.challenge.carsales.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private EmailService emailService;

    @Override
    public List<Pedido> listPedido() {
        return pedidoRepository.findAll();
    }

    @Override
    public Optional<Pedido> findById(Long id) {
        return pedidoRepository.findById(id);
    }

    @Override
    public Optional<Pedido> deletePedido(Pedido pedido, Long id) {
        Optional<Pedido> pedidoDelete = findById(id);
        pedidoRepository.delete(pedidoDelete.get());
        return pedidoDelete;
    }

    @Override
    public Pedido createPedido(Pedido pedido) {
        emailService.sendOrderConfirmationEmail(pedido);
        return pedidoRepository.save(pedido);
    }

    @Override
    public Pedido updatePedido(Pedido pedido, Long id) {
        Optional<Pedido> pedidoUpdate = findById(id);

        pedidoUpdate.get().setCliente(pedido.getCliente());
        pedidoUpdate.get().setInstante(pedido.getInstante());
        pedidoUpdate.get().setItens(pedido.getItens());
        pedidoUpdate.get().setPagamento(pedido.getPagamento());

        Pedido pedidoSaved = pedidoRepository.save(pedidoUpdate.get());

        return pedidoSaved;
    }

    @Override
    public List<Pedido> findByClient(Long id) {
        return pedidoRepository.findByIdClient(id);
    }
}