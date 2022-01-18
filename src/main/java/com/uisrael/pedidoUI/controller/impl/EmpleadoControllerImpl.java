package com.uisrael.pedidoUI.controller.impl;

import java.util.List;

import com.uisrael.pedidoUI.controller.EmpleadoController;
import com.uisrael.pedidoUI.model.dao.EmpleadoDao;
import com.uisrael.pedidoUI.model.dao.impl.EmpleadoDaoImpl;
import com.uisrael.pedidoUI.model.entity.Empleado;

public class EmpleadoControllerImpl implements EmpleadoController {

	private EmpleadoDao empleadoDao = new EmpleadoDaoImpl(); 

	@Override
	public void insertar(Empleado empleado) {
		empleadoDao.insertar(empleado);

	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Empleado> listar() {
		// TODO Auto-generated method stub
		return empleadoDao.listar();
	}

}
