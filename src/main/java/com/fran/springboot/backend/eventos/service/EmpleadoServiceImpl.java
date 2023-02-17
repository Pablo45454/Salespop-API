package com.fran.springboot.backend.eventos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fran.springboot.backend.eventos.entidades.Empleado;
import com.fran.springboot.backend.eventos.repositorios.IEmpleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	private IEmpleado repo;
	@Override
	public Empleado registrar(Empleado empleado) {
		return repo.save(empleado);
	}

	@Override
	public Empleado modificar(Empleado empleado) {
		return repo.save(empleado);
	}

	@Override
	public List<Empleado> listar() {
		return repo.findAll();
	}

	@Override
	public Empleado listarPorId(Integer id) {
		Optional<Empleado> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Empleado();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
