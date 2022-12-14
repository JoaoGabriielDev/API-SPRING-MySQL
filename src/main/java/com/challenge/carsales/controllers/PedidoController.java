package com.challenge.carsales.controllers;

import com.challenge.carsales.entities.Pedido;
import com.challenge.carsales.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/pedidos/")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping(value = "listarPedidos")
    public ResponseEntity<List<Pedido>> listPedido() {
        List<Pedido> pedido = pedidoService.listPedido();
        return new ResponseEntity<List<Pedido>>(pedido, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public Optional<Pedido> getIdPedido(@PathVariable Long id) {
        return pedidoService.findById(id);
    }

    @GetMapping("cliente/{id}")
    public ResponseEntity<List<Pedido>> listPedidosPorCliente(@PathVariable Long id) {
        List<Pedido> pedido = pedidoService.findByClient(id);
        return new ResponseEntity<List<Pedido>>(pedido, HttpStatus.OK);
    }

}
