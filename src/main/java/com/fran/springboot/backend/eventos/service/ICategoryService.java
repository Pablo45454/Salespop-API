package com.fran.springboot.backend.eventos.service;

import java.util.List;

import com.fran.springboot.backend.eventos.entidades.Category;

public interface ICategoryService {
	Category registrar(Category category);
	Category modificar(Category category);
	List<Category> listar();
	Category listarPorId(Integer id);
	void eliminar(Integer id);
}
