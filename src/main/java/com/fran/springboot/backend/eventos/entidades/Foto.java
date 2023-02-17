package com.fran.springboot.backend.eventos.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="salespop_foto")
public class Foto implements java.io.Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private int id;
	
	@Column(name= "name")
	private String name;
	
	@Column(name= "url_imagen")
	private String url_imagen;
	
	@ManyToOne
	@JoinColumn(name = "foto_articulo", nullable = false)
	private Product product;

	public Foto(int id, String name, String url_imagen, Product product) {
		super();
		this.id = id;
		this.name = name;
		this.url_imagen = url_imagen;
		this.product = product;
	}

	public Foto() {
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

	public String getUrl_imagen() {
		return url_imagen;
	}

	public void setUrl_imagen(String url_imagen) {
		this.url_imagen = url_imagen;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
