package com.fran.springboot.backend.eventos.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fran.springboot.backend.eventos.entidades.Product;

@Repository
public interface IProduct extends JpaRepository<Product,Integer>{
	
	@Query("FROM Product p WHERE (p.categoria.id) = :categoria")
	List<Product> listarPorCategoriaId(@Param("categoria") int categoria);
	
	@Query("FROM Product p WHERE (p.categoria.name) = :categoria")
	List<Product> listarPorCategoriaNombre(@Param("categoria") String categoria);
	
	@Query("FROM Product p WHERE (p.seller.user_name) = :seller")
	List<Product> listarPorSeller(@Param("seller") String seller);
}
