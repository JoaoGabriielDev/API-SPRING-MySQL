package com.challenge.carsales.entitie;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "car")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", length = 20, nullable = true)
    private String nome;

    @Column(name = "marca", nullable = true)
    private String marca;

//    @ManyToOne
//    private Store store;
}
