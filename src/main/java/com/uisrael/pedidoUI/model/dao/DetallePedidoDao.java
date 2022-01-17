package com.uisrael.pedidoUI.model.dao;

import java.util.List;

import com.uisrael.pedidoUI.model.entity.DetallePedido;

public interface DetallePedidoDao {
	public void insertar(DetallePedido detallePedido);
	public void actualizar(DetallePedido detallePedido);
	public void eliminar(int id);
	public List<DetallePedido> listar();
}
