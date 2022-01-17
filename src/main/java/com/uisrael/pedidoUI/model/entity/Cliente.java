package com.uisrael.pedidoUI.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="idCliente")
	private int idCliente;
	
	@Column(nullable = false, unique = true)
	private String identificacion;
	
	@Column(name = "cli_nombre")
	private String nombres;
	private String apellidos;
	private String direccion;
	private String telefono;
	private int estadoRegistro;
	
	@OneToMany(cascade = CascadeType.REFRESH, mappedBy = "fkCliente")
	private List<CabeceraPedido> listaCabeceraPedido = new ArrayList();
	
	@Transient
	private int calculoEdad;
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getEstadoRegistro() {
		return estadoRegistro;
	}
	public void setEstadoRegistro(int estadoRegistro) {
		this.estadoRegistro = estadoRegistro;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", identificacion=" + identificacion + ", nombres=" + nombres
				+ ", apellidos=" + apellidos + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", estadoRegistro=" + estadoRegistro + "]";
	}
	

}
