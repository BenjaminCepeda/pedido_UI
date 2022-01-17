package com.uisrael.pedidoUI.controller;

import java.util.List;

import com.uisrael.pedidoUI.model.entity.Empleado;

public interface EmpleadoController {
	public void insertar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public void eliminar(int id);
	public List<Empleado> listar();
}
