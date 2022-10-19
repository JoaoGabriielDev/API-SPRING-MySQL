package com.challenge.carsales.entitie;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pagamento implements Serializable {
     private static final long serialVersionUID = 1l;

     @Id
     private Long id;
     private String estado;

     @JsonIgnore
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
