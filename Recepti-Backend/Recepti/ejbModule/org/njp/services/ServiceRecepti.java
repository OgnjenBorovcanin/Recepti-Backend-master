package org.njp.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.njp.dao.IDAORecepti;
import org.njp.entities.Recepti;

@Stateless
public class ServiceRecepti extends ServiceAbstract<Recepti, IDAORecepti> implements IServiceRecepti{
	
	public ServiceRecepti() {
		super();
	}
	
	@EJB
	@Override
	public void setDAO(IDAORecepti dao) {
		this.dao = dao;
	}

	
}
