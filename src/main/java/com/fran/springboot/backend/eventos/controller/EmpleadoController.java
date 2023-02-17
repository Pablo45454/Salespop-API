package com.fran.springboot.backend.eventos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fran.springboot.backend.eventos.entidades.Empleado;
import com.fran.springboot.backend.eventos.entidades.Usuario;
import com.fran.springboot.backend.eventos.service.IEmpleadoService;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
	
	@Autowired
	private IEmpleadoService service;
	
	@GetMapping
	public List<Empleado> listar() {
	    return service.listar();
	}
	
	@GetMapping("/{id}")
	public Empleado listarPorId(@PathVariable("id") Integer id){
	return service.listarPorId(id);
	}
	@PostMapping
	public Empleado registrar(@RequestBody Empleado empleado) {
	return service.registrar(empleado);
	}
	@PutMapping
	public Empleado modificar(@RequestBody Empleado empleado) {
	return service.modificar(empleado);
	}
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Integer id){
	service.eliminar(id);
	}
}
