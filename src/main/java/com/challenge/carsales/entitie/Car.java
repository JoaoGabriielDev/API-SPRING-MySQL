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
@Table(name = "car")
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "nome", length = 20, nullable = true)
	private String nome;

	@Column(name = "marca", nullable = true)
	private String marca;

	@Column(name = "cor")
	private String cor;

	@Column(name = "ano")
	private Long ano;

	@Column(name = "potencia")
	private double potencia;

	@Column(name = "quilometragem")
	private double quilometragem;

	@Column(name = "cambio")
	private String cambio;

	@Column(name = "portas")
	private String portas;

	@Column(name = "placa")
	private String placa;

	@Column(name = "preço")
	private double preco;



}
