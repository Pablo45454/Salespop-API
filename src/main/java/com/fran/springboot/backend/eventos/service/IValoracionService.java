package com.fran.springboot.backend.eventos.service;

import java.util.List;

import com.fran.springboot.backend.eventos.entidades.Valoracion;


public interface IValoracionService {
	Valoracion registrar(Valoracion valoracion);
	Valoracion modificar(Valoracion valoracion);
	List<Valoracion> listar();
	Valoracion listarPorId(Integer id);
	void eliminar(Integer id);
}
