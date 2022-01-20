package com.uisrael.pedidoUI.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.PrimeFaces;

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
	private List<Cliente> listaClientes = new ArrayList<Cliente>();

	@PostConstruct
	public void init() {
		clienteController = new ClienteControllerImpl();
		cliente = new Cliente();	
		listarClientes();
	}
	
	public void insertar() {
		clienteController.insertar(cliente);
		listarClientes();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registro Ingresado"));
		PrimeFaces.current().ajax().update("frmCliente:mensaje", "frmCliente:dtClientes");	
	}
	
	public void listarClientes() {
		listaClientes = clienteController.listar();
	}
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}
	
	
}
