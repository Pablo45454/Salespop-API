package com.fran.springboot.backend.eventos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fran.springboot.backend.eventos.entidades.Valoracion;
import com.fran.springboot.backend.eventos.repositorios.IValoracion;

@Service
public class ValoracionServiceImpl implements IValoracionService{
	
	@Autowired
	private IValoracion repo;
	
	@Override
	public Valoracion registrar(Valoracion valoracion) {
		return repo.save(valoracion);
	}

	@Override
	public Valoracion modificar(Valoracion valoracion) {
		return repo.save(valoracion);
	}

	@Override
	public List<Valoracion> listar() {
		return repo.findAll();
	}

	@Override
	public Valoracion listarPorId(Integer id) {
		Optional<Valoracion> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Valoracion();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
