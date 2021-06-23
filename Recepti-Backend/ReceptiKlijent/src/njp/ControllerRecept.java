package njp;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.njp.controlers.TestControler;
import org.njp.controlers.TestControlerRemote;
import org.njp.entities.Recepti;

@Stateless
@LocalBean
@Path("/recepti")
public class ControllerRecept {
	
	@EJB
	private  TestControler test;
	
	@EJB
	private TestControlerRemote testRemote;
	
	@GET
	@Produces("text/json")
	public List<Recepti> getAll(@Context HttpServletResponse res) {
		//res.setHeader("Access-Control-Allow-Origin", "*");
		return test.getAllRecepti();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public boolean postRecept(Recepti recept, @Context  HttpServletResponse  res) {
		List<Recepti>  listaRec = new ArrayList();
		for(Recepti r: test.getAllRecepti()) {
			listaRec.add(r);
		}
		if(listaRec.contains(recept.getNaziv())) {
			return false;
		}
		return test.addRecepti(recept);
	}
	
	
	
}
