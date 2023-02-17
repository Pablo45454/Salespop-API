package com.fran.springboot.backend.eventos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fran.springboot.backend.eventos.entidades.Product;
import com.fran.springboot.backend.eventos.entidades.Usuario;
import com.fran.springboot.backend.eventos.service.IUsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
	@Autowired
	private IUsuarioService service;
	
	@GetMapping
	public List<Usuario> listar() {
	    return service.listar();
	}
	
	@GetMapping("/login")
	public Usuario login(
			@RequestParam(value = "mail") String mail,
			@RequestParam(value = "password") String password){
			return service.login(mail,password);
			}
	
	@GetMapping("/{id}")
	public Usuario listarPorId(@PathVariable("id") Integer id){
	return service.listarPorId(id);
	}
	@PostMapping
	public Usuario registrar(@RequestBody Usuario usuario) {
	return service.registrar(usuario);
	}
	@PutMapping
	public Usuario modificar(@RequestBody Usuario usuario) {
	return service.modificar(usuario);
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id){
	service.eliminar(id);
	}
}
