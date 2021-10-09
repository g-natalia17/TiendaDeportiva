package com.tienda.mintic.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.mintic.dao.ClientesDao;
import com.tienda.mintic.model.Clientes;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClientesDao clientedao;
	
	@Override
	public Iterable<Clientes> findAll() {
		// TODO Auto-generated method stub
		return clientedao.findAll();
	}

	@Override
	public Optional<Clientes> findById(Long cedula) {
		// TODO Auto-generated method stub
		return clientedao.findById(cedula);
	}

	@Override
	public Clientes save(Clientes cliente) {
		// TODO Auto-generated method stub
		return clientedao.save(cliente);
	}

	@Override
	public void delete(Long cedula) {
		clientedao.deleteById(cedula);
		
	}

	
	
}