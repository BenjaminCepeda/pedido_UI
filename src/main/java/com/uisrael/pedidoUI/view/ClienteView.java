package com.uisrael.pedidoUI.view;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.uisrael.pedidoUI.controller.ClienteController;
import com.uisrael.pedidoUI.controller.impl.ClienteControllerImpl;
import com.uisrael.pedidoUI.model.entity.Cliente;

@ManagedBean
@ViewScoped
public class ClienteView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ClienteController clienteController;
	private Cliente cliente;

	@PostConstruct
	public void init() {
		clienteController = new ClienteControllerImpl();
		cliente = new Cliente();		
		
	}
	
	public void insertar() {
		clienteController.insertar(cliente);
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
