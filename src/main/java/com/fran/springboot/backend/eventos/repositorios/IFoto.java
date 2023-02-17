package com.fran.springboot.backend.eventos.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fran.springboot.backend.eventos.entidades.Foto;

@Repository
public interface IFoto extends JpaRepository<Foto,Integer>{

}
