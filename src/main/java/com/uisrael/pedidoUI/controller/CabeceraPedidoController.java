package com.uisrael.pedidoUI.controller;

import java.util.List;

import com.uisrael.pedidoUI.model.entity.CabeceraPedido;

public interface CabeceraPedidoController {
	public void insertar(CabeceraPedido cabeceraPedido);
	public void actualizar(CabeceraPedido cabeceraPedido);
	public void eliminar(int id);
	public List<CabeceraPedido> listar();

}
