package com.fran.springboot.backend.eventos.entidades;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="salespop_product")
public class Product implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private int price;
	
	@Column(name="description")
	private String description;
	
	@Column(name="ubication")
	private String ubication;
	
	@Temporal(TemporalType.DATE)
	@Column(name="publication_date")
	private Date publication_date;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="seller",nullable=false)
	private Usuario seller;
	
	@ManyToOne
	@JoinColumn(name="categoria",nullable=false)
	private Category categoria;
	
	@JsonIgnore
	@OneToMany(mappedBy="product", cascade = CascadeType.ALL)
	private Set<Foto> foto = new HashSet<Foto>(0);

	public Product(int id, String name, int price, String description, String ubication, Date publication_date,
			Usuario seller, Category categoria, Set<Foto> foto) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.ubication = ubication;
		this.publication_date = publication_date;
		this.seller = seller;
		this.categoria = categoria;
		this.foto = foto;
	}
	
	

	public Product() {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUbication() {
		return ubication;
	}

	public void setUbication(String ubication) {
		this.ubication = ubication;
	}

	public Date getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}

	public Usuario getSeller() {
		return seller;
	}

	public void setSeller(Usuario seller) {
		this.seller = seller;
	}

	public Category getCategoria() {
		return categoria;
	}

	public void setCategoria(Category categoria) {
		this.categoria = categoria;
	}

	public Set<Foto> getFoto() {
		return foto;
	}

	public void setFoto(Set<Foto> foto) {
		this.foto = foto;
	}
	
	
}
