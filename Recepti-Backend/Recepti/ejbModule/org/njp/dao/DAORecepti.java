package org.njp.dao;

import javax.ejb.Stateless;

import org.njp.entities.Recepti;

@Stateless
public class DAORecepti extends DAOAbstractDatabase<Recepti> implements IDAORecepti {

	public DAORecepti() {
		super(Recepti.class);
	}

}
