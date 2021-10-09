package com.tienda.mintic.service;

import java.util.Optional;

import com.tienda.mintic.model.Clientes;


public interface ClienteService {
	
	public Iterable<Clientes> findAll();
	
	public Optional<Clientes> findById(Long cedula);
	
	public Clientes save(Clientes cliente);
	
	public void delete(Long cedula);

}