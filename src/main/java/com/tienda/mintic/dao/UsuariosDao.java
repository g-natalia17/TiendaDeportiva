package com.tienda.mintic.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.mintic.model.Usuarios;

public interface UsuariosDao extends JpaRepository <Usuarios, Long> {

	Iterable<Usuarios> findAll();

	Optional<Usuarios> findById(Long cedula);

	Usuarios save(Usuarios usuario);

	void deleteById(Long cedula);

	
	
}