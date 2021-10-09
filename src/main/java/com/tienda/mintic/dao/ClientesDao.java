package com.tienda.mintic.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.mintic.model.Clientes;

public interface ClientesDao extends JpaRepository<Clientes, Long> {

	Iterable<Clientes> findAll();

	Optional<Clientes> findById(Long cedula);

	Clientes save(Clientes cliente);

	void deleteById(Long cedula);

}
