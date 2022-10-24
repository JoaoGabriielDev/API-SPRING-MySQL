package com.challenge.carsales.repositories;

import com.challenge.carsales.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

    @Query(value = "select * from pedido where cliente_id = :id", nativeQuery = true)
    List<Pedido> findByIdClient(@PathVariable Long id);
}
