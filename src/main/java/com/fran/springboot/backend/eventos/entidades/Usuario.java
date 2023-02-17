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
@Table(name= "res_partner")
public class Usuario implements java.io.Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "user_name")
	private String user_name;
	
	@Column(name = "mail")
	private String mail;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "num_tel")
	private String num_tel;
	
	
	@OneToMany(mappedBy = "seller", cascade = CascadeType.ALL)
	private Set<Product> on_sale = new HashSet<Product>(0);
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario" , cascade = CascadeType.ALL)
	private Set<Valoracion> valoracion = new HashSet<Valoracion>(0);

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

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNum_tel() {
		return num_tel;
	}

	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
	}

	public Set<Product> getOn_sale() {
		return on_sale;
	}

	public void setOn_sale(Set<Product> on_sale) {
		this.on_sale = on_sale;
	}

	public Set<Valoracion> getValoracion() {
		return valoracion;
	}

	public void setValoracion(Set<Valoracion> valoracion) {
		this.valoracion = valoracion;
	}

	public Usuario(int id, String name, String user_name, String mail, String password, String num_tel,
			Set<Product> on_sale, Set<Valoracion> valoracion) {
		super();
		this.id = id;
		this.name = name;
		this.user_name = user_name;
		this.mail = mail;
		this.password = password;
		this.num_tel = num_tel;
		this.on_sale = on_sale;
		this.valoracion = valoracion;
	}

	public Usuario() {
		super();
	}

	public Usuario(String name, String user_name, String mail, String password, String num_tel) {
		super();
		this.name = name;
		this.user_name = user_name;
		this.mail = mail;
		this.password = password;
		this.num_tel = num_tel;
	}

	public Usuario(int id, String name, String user_name, String mail, String password, String num_tel) {
		super();
		this.id = id;
		this.name = name;
		this.user_name = user_name;
		this.mail = mail;
		this.password = password;
		this.num_tel = num_tel;
	}
	
	
}
