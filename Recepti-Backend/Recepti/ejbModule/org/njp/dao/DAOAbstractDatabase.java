package org.njp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.njp.entities.BasicEntity;
import org.njp.entities.Recepti;

public abstract class DAOAbstractDatabase<T extends BasicEntity> implements IDAOAbstract<T> {
	
	public DAOAbstractDatabase(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public boolean add(T object) {
		if(object == null)
			return false;
		entityManager.persist(object);
		return true;
	}

	@Override
	public boolean removeById(int id) {
		return false;
	}

	@Override
	public boolean update(T object) {
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {
		return entityManager.createQuery(String.format("from %s", this.clazz.getSimpleName())).getResultList();
	}
	

	@Override
	public T getById(int id) {
		Recepti recept = new  Recepti();
		return null;
		
	}


	// property
	/**
	 * Svojstvo koje cuva klasu za koju se pravi query
	 */
	private Class<T> clazz;
	
	@PersistenceContext
	private EntityManager entityManager;
}
