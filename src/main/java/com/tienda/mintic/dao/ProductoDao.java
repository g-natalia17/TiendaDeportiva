package com.tienda.mintic.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.mintic.model.Producto;

public interface ProductoDao extends JpaRepository<Producto, Long>{

	Iterable<Producto> findAll();

	Optional<Producto> findById(Long codigo);

	Producto save(Producto producto);

	void deleteById(Long codigo);

}
