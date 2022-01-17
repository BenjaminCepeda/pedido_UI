package com.uisrael.pedidoUI.controller.impl;

import java.util.List;

import com.uisrael.pedidoUI.controller.ClienteController;
import com.uisrael.pedidoUI.model.dao.ClienteDao;
import com.uisrael.pedidoUI.model.dao.impl.ClienteDaoImpl;
import com.uisrael.pedidoUI.model.entity.Cliente;

public class ClienteControllerImpl implements ClienteController {

	private ClienteDao clienteDao = new ClienteDaoImpl(); 
	
	@Override
	public void insertar(Cliente cliente) {
		clienteDao.insertar(cliente);
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> listar() {
		
		return clienteDao.listar();
	}

	@Override
	public List<Cliente> listarTQ() {
		// TODO Auto-generated method stub
		
		return clienteDao.listarTQ();
	}

}
