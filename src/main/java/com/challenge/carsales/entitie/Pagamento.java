package com.challenge.carsales.entitie;

import com.challenge.carsales.enums.EstadoPagamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
public class Pagamento implements Serializable {
     private static final long serialVersionUID = 1l;

     @Id
     private Long id;
     private EstadoPagamento estado;

     @OneToOne
     @JoinColumn(name = "pedido_id")
     @MapsId
     private Pedido pedido;

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Pagamento pagamento = (Pagamento) o;
          return id.equals(pagamento.id);
     }

     @Override
     public int hashCode() {
          return Objects.hash(id);
     }
}
