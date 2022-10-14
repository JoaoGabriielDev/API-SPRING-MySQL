package com.challenge.carsales.repositorie;

import com.challenge.carsales.entitie.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
