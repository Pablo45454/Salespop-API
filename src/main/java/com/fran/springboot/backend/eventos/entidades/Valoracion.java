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
@Table(name = "salespop_valoracion")
public class Valoracion implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "puntuacion")
	private String puntuacion;
	
	@ManyToOne
	@JoinColumn(name = "valoracion_usuario")
	private Usuario usuario;

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

	public String getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(String puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Valoracion(int id, String name, String puntuacion, Usuario usuario) {
		super();
		this.id = id;
		this.name = name;
		this.puntuacion = puntuacion;
		this.usuario = usuario;
	}

	public Valoracion() {
		super();
	}
	
	
}
