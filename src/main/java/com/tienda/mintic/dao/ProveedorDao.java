package com.tienda.mintic.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.mintic.model.Proveedor;


public interface ProveedorDao extends JpaRepository<Proveedor, Long>{

	Iterable<Proveedor> findAll();

	Optional<Proveedor> findById(Long nit);

	Proveedor save(Proveedor proveedor);

	void deleteById(Long nit);

}