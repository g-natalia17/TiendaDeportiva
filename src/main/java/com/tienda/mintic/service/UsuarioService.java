package com.tienda.mintic.service;


import java.util.Optional;

import com.tienda.mintic.model.Usuarios;

public interface UsuarioService {

	public Iterable<Usuarios> findAll();
	
	public Optional<Usuarios> findById(Long cedula);
	
	public Usuarios save(Usuarios usuario);
	
	public void delete(Long cedula);
		
	
}