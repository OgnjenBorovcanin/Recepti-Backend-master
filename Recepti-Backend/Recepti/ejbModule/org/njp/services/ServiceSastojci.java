package org.njp.services;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import org.njp.dao.IDAOSastojci;
import org.njp.entities.Sastojci;


@Stateless
public class ServiceSastojci extends ServiceAbstract<Sastojci, IDAOSastojci> implements IServiceSastojci{

	public ServiceSastojci() {
		super();
	}

	@EJB
	@Override
	public void setDAO(IDAOSastojci dao) {
		this.dao = dao;
	}

}
