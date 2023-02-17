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
import org.springframework.web.bind.annotation.RestController;

import com.fran.springboot.backend.eventos.entidades.Category;
import com.fran.springboot.backend.eventos.entidades.Usuario;
import com.fran.springboot.backend.eventos.service.ICategoryService;

@RestController
@RequestMapping("/api/categorias")
public class CategoryController {
	
	@Autowired
	private ICategoryService service;
	
	@GetMapping
	public List<Category> listar() {
	    return service.listar();
	}
	
	@GetMapping("/{id}")
	public Category listarPorId(@PathVariable("id") Integer id){
	return service.listarPorId(id);
	}
	@PostMapping
	public Category registrar(@RequestBody Category category) {
	return service.registrar(category);
	}
	@PutMapping
	public Category modificar(@RequestBody Category category) {
	return service.modificar(category);
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id){
	service.eliminar(id);
	}
}
