package com.challenge.carsales.entitie;

import com.challenge.carsales.enums.EstadoPagamento;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PagamentoComCartao extends Pagamento{
    private static final long serialVersionUID = 1l;

    private Long numeroParcelas;

    public PagamentoComCartao(Long id, EstadoPagamento estado, Pedido pedido, Long numeroParcelas) {
        super(id, estado, pedido);
        this.numeroParcelas = numeroParcelas;
    }
}
