package com.fran.springboot.backend.eventos.service;

import java.util.List;

import com.fran.springboot.backend.eventos.entidades.Empleado;

public interface IEmpleadoService {
	Empleado registrar(Empleado empleado);
	Empleado modificar(Empleado empleado);
	List<Empleado> listar();
	Empleado listarPorId(Integer id);
	void eliminar(Integer id);
}
