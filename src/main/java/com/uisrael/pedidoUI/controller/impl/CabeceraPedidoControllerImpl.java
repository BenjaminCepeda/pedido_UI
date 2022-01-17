package com.uisrael.pedidoUI.controller.impl;

import java.util.List;

import com.uisrael.pedidoUI.controller.CabeceraPedidoController;
import com.uisrael.pedidoUI.model.dao.CabeceraPedidoDao;
import com.uisrael.pedidoUI.model.dao.impl.CabeceraPedidoDaoImpl;
import com.uisrael.pedidoUI.model.entity.CabeceraPedido;

public class CabeceraPedidoControllerImpl implements CabeceraPedidoController {
	private CabeceraPedidoDao cabeceraPedidoDao = new CabeceraPedidoDaoImpl(); 
	@Override
	public void insertar(CabeceraPedido cabeceraPedido) {
		cabeceraPedidoDao.insertar(cabeceraPedido);

	}

	@Override
	public void actualizar(CabeceraPedido cabeceraPedido) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<CabeceraPedido> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
