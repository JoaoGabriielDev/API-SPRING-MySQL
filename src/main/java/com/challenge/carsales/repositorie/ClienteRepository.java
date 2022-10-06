package com.challenge.carsales.repositorie;

import com.challenge.carsales.entitie.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
