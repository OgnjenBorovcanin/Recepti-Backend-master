package org.njp.dao;

import javax.ejb.Stateless;

import org.njp.entities.Sastojci;

@Stateless
public class DAOSastojci extends DAOAbstractDatabase<Sastojci> implements IDAOSastojci {

	public DAOSastojci() {
		super(Sastojci.class);
	}

}
