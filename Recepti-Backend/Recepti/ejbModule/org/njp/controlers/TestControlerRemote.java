package org.njp.controlers;

import java.util.List;

import javax.ejb.Remote;

import org.njp.entities.Recepti;
import org.njp.entities.Sastojci;

@Remote
public interface TestControlerRemote {
	
	public List<Recepti> getAllRecepti();
	public boolean addRecepti(Recepti student);
	public List<Sastojci>  getAllSastojci();
	public boolean addSastojci(Sastojci sastojci);
}
