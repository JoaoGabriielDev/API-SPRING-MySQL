package com.challenge.carsales.entitie;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
public class CarPedido implements Serializable {
    private static final long serialVersionUID = 1l;
// classe de associação

    @JsonIgnore
    @EmbeddedId
    private CarPedidoPK id = new CarPedidoPK();
    // classe auxiliar

    private Long quantidade;
    private Double preco;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarPedido carPedido = (CarPedido) o;
        return id.equals(carPedido.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
