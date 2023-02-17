package com.fran.springboot.backend.eventos.service;

import java.util.List;

import com.fran.springboot.backend.eventos.entidades.Foto;

public interface IFotoService {
	Foto registrar(Foto foto);
	Foto modificar(Foto foto);
	List<Foto> listar();
	Foto listarPorId(Integer id);
	void eliminar(Integer id);
}
