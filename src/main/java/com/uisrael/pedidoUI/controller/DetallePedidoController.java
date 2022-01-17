package com.uisrael.pedidoUI.controller;

import java.util.List;

import com.uisrael.pedidoUI.model.entity.DetallePedido;

public interface DetallePedidoController {
	public void insertar(DetallePedido detallePedido);
	public void actualizar(DetallePedido detallePedido);
	public void eliminar(int id);
	public List<DetallePedido> listar();

}
