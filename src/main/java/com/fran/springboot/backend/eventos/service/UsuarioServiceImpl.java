package com.fran.springboot.backend.eventos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fran.springboot.backend.eventos.entidades.Usuario;
import com.fran.springboot.backend.eventos.repositorios.IUsuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private IUsuario repo;
	@Override
	public Usuario registrar(Usuario usuario) {
		return repo.save(usuario);
	}

	@Override
	public Usuario modificar(Usuario usuario) {
		return repo.save(usuario);
	}

	@Override
	public List<Usuario> listar() {
		return repo.findAll();
	}

	@Override
	public Usuario listarPorId(Integer id) {
		Optional<Usuario> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Usuario();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Usuario login(String mail, String password) {
		return repo.login(mail, password);
	}

	

}
