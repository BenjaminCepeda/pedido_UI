package com.uisrael.pedidoUI.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uisrael.pedidoUI.model.dao.EmpleadoDao;
import com.uisrael.pedidoUI.model.entity.Empleado;


public class EmpleadoDaoImpl extends GenericDaoImpl<Empleado> implements  EmpleadoDao{

	@Override
	public void insertar(Empleado empleado) {
		this.beginTransaction();
		this.create(empleado);
		this.commit();

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
		return null;
	}

}
