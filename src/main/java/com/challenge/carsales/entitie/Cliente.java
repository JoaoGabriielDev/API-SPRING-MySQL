package com.challenge.carsales.entitie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "usuario")
    private String name;


    @Column(name = "cpf", length = 20, nullable = true)
    private Long cpf;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private Long telefone;

    @Column(name = "endereço")
    private String endereco;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cep")
    private float cep;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;
}
