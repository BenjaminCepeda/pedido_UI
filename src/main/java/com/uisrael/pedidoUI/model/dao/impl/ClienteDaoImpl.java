package com.uisrael.pedidoUI.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.uisrael.pedidoUI.model.dao.ClienteDao;
import com.uisrael.pedidoUI.model.entity.Cliente;

public class ClienteDaoImpl implements ClienteDao {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PUPedidoUI");
	EntityManager em = emf.createEntityManager();

	@Override
	public void insertar(Cliente cliente) {
		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Cliente> listar() {

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Cliente> cq = cb.createQuery(Cliente.class);
		Root<Cliente> cliente = cq.from(Cliente.class);
		cq.select(cliente);
		
		return em.createQuery(cq).getResultList();
	}

	public List<Cliente> listarTQ() {
		TypedQuery<Cliente> sqlTQ = em.createQuery("Select cli From Cliente cli ", Cliente.class);
		return sqlTQ.getResultList();
	}

}
