package org.njp.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the recepti database table.
 * 
 */
@Entity
@NamedQuery(name="Recepti.findAll", query="SELECT r FROM Recepti r")
public class Recepti extends BasicEntity implements Serializable {
	private static final long serialVersionUID = 1L;

//	@Id
//	private int id;

	@Lob
	private String naziv;

	@Lob
	private String opis;

	@Lob
	private String sastojci;

	@Lob
	private String urlslike;

	public Recepti() {
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

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getSastojci() {
		return this.sastojci;
	}

	public void setSastojci(String sastojci) {
		this.sastojci = sastojci;
	}

	public String getUrlslike() {
		return this.urlslike;
	}

	public void setUrlslike(String urlslike) {
		this.urlslike = urlslike;
	}

}