package com.challenge.carsales.entitie;

import com.fasterxml.jackson.annotation.JsonIgnore;;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CarPedido implements Serializable {
    private static final long serialVersionUID = 1l;
// classe de associação

    @JsonIgnore
    @EmbeddedId
    private CarPedidoPK id = new CarPedidoPK();
    // classe auxiliar

    private Long quantidade;
    private Double preco;

    public CarPedido(Pedido pedido, Car car, Long quantidade, Double preco) {
        super();
        id.setPedido(pedido);
        id.setCar(car);
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @JsonIgnore
    public Pedido getPedido() {
        return id.getPedido();
    }

    public Car getCar() {
        return id.getCar();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CarPedido other = (CarPedido) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}

