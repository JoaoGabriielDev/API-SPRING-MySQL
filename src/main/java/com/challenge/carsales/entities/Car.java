package com.challenge.carsales.entities;

import javax.persistence.*;


@Entity
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
	
	@ManyToOne
	private Store store;
	
	public Car() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setBrand(String marca) {
		this.marca = marca;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	
	
}
