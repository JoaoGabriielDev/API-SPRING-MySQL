package com.challenge.carsales.entitie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.xml.crypto.Data;

@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
public class Pedido {

    private Long id;
    private Data instante;

}
