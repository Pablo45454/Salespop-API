package com.fran.springboot.backend.eventos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fran.springboot.backend.eventos.entidades.Product;
import com.fran.springboot.backend.eventos.repositorios.IProduct;

@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private IProduct repo;
	@Override
	public Product registrar(Product product) {
		return repo.save(product);
	}
	
	@Override
	public List<Product> listarPorCategoriaId(int categoria) {
	return repo.listarPorCategoriaId(categoria);
	}
	
	@Override
	public List<Product> listarPorCategoriaNombre(String categoria) {
	return repo.listarPorCategoriaNombre(categoria);
	}

	@Override
	public Product modificar(Product product) {
		return repo.save(product);
	}

	@Override
	public List<Product> listar() {
		return repo.findAll();
	}

	@Override
	public Product listarPorId(Integer id) {
		Optional<Product> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Product();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public List<Product> listarPorSeller(String seller) {
		return repo.listarPorSeller(seller);
	}

}
