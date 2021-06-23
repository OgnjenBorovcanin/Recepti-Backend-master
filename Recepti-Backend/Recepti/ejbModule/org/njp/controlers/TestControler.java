package org.njp.controlers;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import org.njp.entities.Recepti;
import org.njp.entities.Sastojci;
import org.njp.services.IServiceRecepti;
import org.njp.services.IServiceSastojci;


/**
 * Session Bean implementation class TestControler
 */
@Stateless
@LocalBean
public class TestControler implements TestControlerRemote {

    /**
     * Default constructor. 
     */
    public TestControler() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Recepti> getAllRecepti() {
		System.out.println("TEST TEST");
		return serviceRecepti.getAll();
	}
	
	@Override
	public boolean addRecepti(Recepti recepti) {
		
		return serviceRecepti.add(recepti);
	}
	
	@Override
	public List<Sastojci> getAllSastojci(){
		System.out.println("SASTOJAK SASTOJAK");
		return serviceSastojci.getAll();
	}
	
	@Override
	public boolean addSastojci(Sastojci sastojci) {
		return serviceSastojci.add(sastojci);
	}
	
	@EJB
	private IServiceRecepti serviceRecepti;

	@EJB
	private IServiceSastojci serviceSastojci;

}
