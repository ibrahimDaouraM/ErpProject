package ma.iknengenieering.ErpProject.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("Facture Re�u")
public class Facture_Re�u extends Facture {
	@ManyToOne
	@JoinColumn(name="ID_Fourniseur")
	private Fournisseur fournisseur;

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Facture_Re�u(Fournisseur fournisseur) {
		super();
		this.fournisseur = fournisseur;
	}

	public Facture_Re�u() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture_Re�u(String nomSociet�, String adresse, Long tel, String reference, Date date) {
		super(nomSociet�, adresse, tel, reference, date);
		// TODO Auto-generated constructor stub
	}
}
