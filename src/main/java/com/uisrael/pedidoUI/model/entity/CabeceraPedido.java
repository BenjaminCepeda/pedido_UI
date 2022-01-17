package com.uisrael.pedidoUI.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cabecera_pedido")
public class CabeceraPedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCabeceraPedido;
	private String observacion;
	
	@Temporal(TemporalType.DATE )
	private Date fechaPedido;
	private String formaPago;
	private int estadoRegistro;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	/*Nombe de la columna foreign key*/
	@JoinColumn(name = "idCliente")
	private Cliente fkCliente;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	/*Nombe de la columna foreign key*/
	@JoinColumn(name = "idEmpleado")
	private Empleado fkEmpleado;

	public int getIdCabeceraPedido() {
		return idCabeceraPedido;
	}
	public void setIdCabeceraPedido(int idCabeceraPedido) {
		this.idCabeceraPedido = idCabeceraPedido;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public String getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public int getEstadoRegistro() {
		return estadoRegistro;
	}
	
	public void setEstadoRegistro(int estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	
	
	public Cliente getFkCliente() {
		return fkCliente;
	}
	public void setFkCliente(Cliente fkCliente) {
		this.fkCliente = fkCliente;
	}
	public Empleado getFkEmpleado() {
		return fkEmpleado;
	}
	public void setFkEmpleado(Empleado fkEmpleado) {
		this.fkEmpleado = fkEmpleado;
	}
	@Override
	public String toString() {
		return "CabeceraPedido [idCabeceraPedido=" + idCabeceraPedido + ", observacion=" + observacion
				+ ", fechaPedido=" + fechaPedido + ", formaPago=" + formaPago + ", estadoRegistro=" + estadoRegistro
				+ ", fkCliente=" + fkCliente + ", fkEmpleado=" + fkEmpleado + "]";
	}

	
}
