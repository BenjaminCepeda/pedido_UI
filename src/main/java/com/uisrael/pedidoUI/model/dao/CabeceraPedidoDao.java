package com.uisrael.pedidoUI.model.dao;

import java.util.List;

import com.uisrael.pedidoUI.model.entity.CabeceraPedido;


public interface CabeceraPedidoDao {
	public void insertar(CabeceraPedido cabeceraPedido);
	public void actualizar(CabeceraPedido cabeceraPedido);
	public void eliminar(int id);
	public List<CabeceraPedido> listar();
		
}
