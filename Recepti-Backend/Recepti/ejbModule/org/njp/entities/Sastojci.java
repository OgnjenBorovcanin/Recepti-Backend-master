package org.njp.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sastojci database table.
 * 
 */
@Entity
@NamedQuery(name="Sastojci.findAll", query="SELECT s FROM Sastojci s")
public class Sastojci extends BasicEntity implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
//	private int id;

	@Lob
	private String naziv;

	public Sastojci() {
	}

//	public int getId() {
//		return this.id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

}