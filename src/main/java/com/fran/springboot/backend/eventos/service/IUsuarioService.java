package com.fran.springboot.backend.eventos.service;

import java.util.List;

import com.fran.springboot.backend.eventos.entidades.Usuario;

public interface IUsuarioService {
	Usuario registrar(Usuario usuario);
	Usuario modificar(Usuario usuario);
	List<Usuario> listar();
	Usuario listarPorId(Integer id);
	void eliminar(Integer id);
	Usuario login(String mail, String password);
}
