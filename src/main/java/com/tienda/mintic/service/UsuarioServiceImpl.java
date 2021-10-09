package com.tienda.mintic.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.mintic.dao.UsuariosDao;
import com.tienda.mintic.model.Usuarios;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuariosDao usuariodao;
	
	
	@Override
	public Iterable<Usuarios> findAll() {
		// TODO Auto-generated method stub
		return usuariodao.findAll();
	}

	@Override
	public Optional<Usuarios> findById(Long cedula) {
		// TODO Auto-generated method stub
		return usuariodao.findById(cedula);
	}

	@Override
	public Usuarios save(Usuarios usuario) {
		// TODO Auto-generated method stub
		return usuariodao.save(usuario);
	}

	@Override
	public void delete(Long cedula) {
		usuariodao.deleteById(cedula);
		
	}
	
	
	
	
}