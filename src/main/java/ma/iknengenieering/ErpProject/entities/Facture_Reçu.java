package ma.iknengenieering.ErpProject.entities;



import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("Facture Reçu")
public class Facture_Reçu extends Facture {
	private String Codefournisseur;

	public Facture_Reçu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture_Reçu(String nomSocieté, String adresse, Long tel, String reference, Date date) {
		super(nomSocieté, adresse, tel, reference, date);
		// TODO Auto-generated constructor stub
	}

	public Facture_Reçu(String codefournisseur) {
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
