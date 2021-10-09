package com.tienda.mintic.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="venta")
public class Venta {

	@Id
	@Column(nullable = false)
	private Long codigo_venta;
	
	@ManyToOne 
	@JoinColumn(nullable = false) 
	private Clientes cedula_cliente;
	
	@ManyToOne 
	@JoinColumn(nullable = false) 
	private Usuarios cedula_usuario;
	
	private Double ivaventa;
	
	private Double total_venta;
	
	private Double valor_venta;

	public Long getCodigo_venta() {
		return codigo_venta;
	}

	public void setCodigo_venta(Long codigo_venta) {
		this.codigo_venta = codigo_venta;
	}

	public Cliente getCedula_cliente() {
		return cedula_cliente;
	}

	public void setCedula_cliente(Cliente cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}

	public Usuario getCedula_usuario() {
		return cedula_usuario;
	}

	public void setCedula_usuario(Usuario cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}

	public Double getIvaventa() {
		return ivaventa;
	}

	public void setIvaventa(Double ivaventa) {
		this.ivaventa = ivaventa;
	}

	public Double getTotal_venta() {
		return total_venta;
	}

	public void setTotal_venta(Double total_venta) {
		this.total_venta = total_venta;
	}

	public Double getValor_venta() {
		return valor_venta;
	}

	public void setValor_venta(Double valor_venta) {
		this.valor_venta = valor_venta;
	}
	
	
	
}