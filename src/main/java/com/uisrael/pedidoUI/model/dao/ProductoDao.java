package com.uisrael.pedidoUI.model.dao;

import java.util.List;

import com.uisrael.pedidoUI.model.entity.Producto;

public interface ProductoDao {
	public void insertar(Producto producto);
	public void actualizar(Producto producto);
	public void eliminar(int id);
	public List<Producto> listar();
}
