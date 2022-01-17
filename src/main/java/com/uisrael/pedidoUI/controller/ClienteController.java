package com.uisrael.pedidoUI.controller;

import java.util.List;

import com.uisrael.pedidoUI.model.entity.Cliente;

public interface ClienteController {
	public void insertar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public void eliminar(int id);
	public List<Cliente> listar();
	public List<Cliente> listarTQ();
}
