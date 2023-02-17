package com.fran.springboot.backend.eventos.service;

import java.util.List;

import com.fran.springboot.backend.eventos.entidades.Product;

public interface IProductService {
	Product registrar(Product product);
	Product modificar(Product product);
	List<Product> listar();
	Product listarPorId(Integer id);
	void eliminar(Integer id);
	List<Product> listarPorCategoriaId(int categoria);
	List<Product> listarPorCategoriaNombre(String categoria);
	List<Product> listarPorSeller(String seller);
}
