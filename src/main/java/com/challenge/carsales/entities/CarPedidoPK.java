package com.challenge.carsales.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
//subtipo
public class CarPedidoPK implements Serializable {
    private static final long serialVersionUID = 1l;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarPedidoPK that = (CarPedidoPK) o;
        return car.equals(that.car) && pedido.equals(that.pedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, pedido);
    }
}
