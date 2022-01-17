package com.uisrael.pedidoUI.controller;

import java.util.List;

import com.uisrael.pedidoUI.model.entity.Producto;

public interface ProductoController {
	public void insertar(Producto producto);
	public void actualizar(Producto producto);
	public void eliminar(int id);
	public List<Producto> listar();

}
