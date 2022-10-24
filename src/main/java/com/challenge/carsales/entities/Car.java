package com.challenge.carsales.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Table(name = "car")
public class Car {

	@JsonIgnore
	@OneToMany(mappedBy = "id.car")
	private Set<CarPedido> itens = new HashSet<>();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "marca")
	private String marca;

	@Column(name = "cor")
	private String cor;

	@Column(name = "ano")
	private Long ano;

	@Column(name = "potencia")
	private float potencia;

	@Column(name = "quilometragem")
	private float quilometragem;

	@Column(name = "cambio")
	private String cambio;

	@Column(name = "portas")
	private String portas;

	@Column(name = "placa")
	private String placa;

	@Column(name = "preco")
	private Double preco;
}
