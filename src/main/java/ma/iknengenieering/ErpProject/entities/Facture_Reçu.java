package ma.iknengenieering.ErpProject.entities;



import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("Facture Re�u")
public class Facture_Re�u extends Facture {
	private String Codefournisseur;

	public Facture_Re�u() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture_Re�u(String nomSociet�, String adresse, Long tel, String reference, Date date) {
		super(nomSociet�, adresse, tel, reference, date);
		// TODO Auto-generated constructor stub
	}

	public Facture_Re�u(String codefournisseur) {
		super();
		Codefournisseur = codefournisseur;
	}

	public String getCodefournisseur() {
		return Codefournisseur;
	}

	public void setCodefournisseur(String codefournisseur) {
		Codefournisseur = codefournisseur;
	}

	

}
