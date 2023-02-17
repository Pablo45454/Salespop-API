package com.fran.springboot.backend.eventos.entidades;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="salespop_category")
public class Category implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id", unique = true, nullable = false)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@JsonIgnore
	@OneToMany(mappedBy="categoria", cascade = CascadeType.ALL)
	private Set<Product> articulos = new HashSet<Product>(0);

	public Category(int id, String name, Set<Product> articulos) {
		super();
		this.id = id;
		this.name = name;
		this.articulos = articulos;
	}

	public Category() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Product> getArticulos() {
		return articulos;
	}

	public void setArticulos(Set<Product> articulos) {
		this.articulos = articulos;
	}
	
	
	
}
