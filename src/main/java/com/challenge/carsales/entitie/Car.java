package com.challenge.carsales.entitie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Table(name = "car")
public class Car {

	@OneToMany(mappedBy = "id.produto")
	private Set<CarPedido> itens = new HashSet<>();

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
	private float potencia;

	@Column(name = "quilometragem")
	private float quilometragem;

	@Column(name = "cambio")
	private String cambio;

	@Column(name = "portas")
	private String portas;

	@Column(name = "placa")
	private String placa;

	@Column(name = "preço")
	private Long preco;



}
