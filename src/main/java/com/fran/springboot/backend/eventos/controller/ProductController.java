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
import com.fran.springboot.backend.eventos.service.IProductService;

@RestController
@RequestMapping("/api/productos")
public class ProductController {
	@Autowired
	private IProductService service;
	
	@GetMapping
	public List<Product> listar() {
	    return service.listar();
	}
	@GetMapping("/filtrarid")
	public List<Product> listarPorCategoriaId(
	@RequestParam(value = "categoria") int categoria){
	return service.listarPorCategoriaId(categoria);
	}
	
	@GetMapping("/filtrarnombre")
	public List<Product> listarPorCategoriaNombre(
	@RequestParam(value = "categoria") String categoria){
	return service.listarPorCategoriaNombre(categoria);
	}
	
	@GetMapping("/filtrarseller")
	public List<Product> listarPorSeller(
	@RequestParam(value = "seller") String seller){
	return service.listarPorSeller(seller);
	}
	
	@GetMapping("/{id}")
	public Product listarPorId(@PathVariable("id") Integer id){
	return service.listarPorId(id);
	}
	@PostMapping
	public Product registrar(@RequestBody Product product) {
	return service.registrar(product);
	}
	@PutMapping
	public Product modificar(@RequestBody Product product) {
	return service.modificar(product);
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id){
	service.eliminar(id);
	}
}
