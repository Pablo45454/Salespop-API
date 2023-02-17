package com.fran.springboot.backend.eventos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fran.springboot.backend.eventos.entidades.Category;
import com.fran.springboot.backend.eventos.repositorios.ICategory;

@Service
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	private ICategory repo;

	@Override
	public Category registrar(Category category) {
		return repo.save(category);
	}

	@Override
	public Category modificar(Category category) {
		return repo.save(category);
	}

	@Override
	public List<Category> listar() {
		return repo.findAll();
	}

	@Override
	public Category listarPorId(Integer id) {
		Optional<Category> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Category();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
		
	}

}
