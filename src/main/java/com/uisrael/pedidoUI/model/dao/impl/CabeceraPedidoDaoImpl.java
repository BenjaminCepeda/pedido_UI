package com.uisrael.pedidoUI.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.uisrael.pedidoUI.model.dao.CabeceraPedidoDao;
import com.uisrael.pedidoUI.model.entity.CabeceraPedido;

public class CabeceraPedidoDaoImpl implements CabeceraPedidoDao {

	@Override
	public void insertar(CabeceraPedido cabeceraPedido) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PUPedidoUI");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(cabeceraPedido);
		em.getTransaction().commit();
		

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
