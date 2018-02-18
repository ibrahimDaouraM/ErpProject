package ma.iknengenieering.ErpProject.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("Facture Reçu")
public class Facture_Reçu extends Facture {
	@ManyToOne
	@JoinColumn(name="ID_Fourniseur")
	private Fournisseur fournisseur;

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Facture_Reçu(Fournisseur fournisseur) {
		super();
		this.fournisseur = fournisseur;
	}

	public Facture_Reçu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture_Reçu(String nomSocieté, String adresse, Long tel, String reference, Date date) {
		super(nomSocieté, adresse, tel, reference, date);
		// TODO Auto-generated constructor stub
	}
}
