package com.fran.springboot.backend.eventos.repositorios;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.fran.springboot.backend.eventos.entidades.Usuario;

@Repository
public interface IUsuario extends JpaRepository<Usuario,Integer>{
	@Query("FROM Usuario u WHERE (u.mail) = :mail AND (u.password) = :password")
	Usuario login(@Param("mail") String mail, @Param("password") String password);

}
