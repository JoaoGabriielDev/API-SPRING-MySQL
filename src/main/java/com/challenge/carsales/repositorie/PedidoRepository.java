package com.challenge.carsales.repositorie;

import com.challenge.carsales.entitie.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
