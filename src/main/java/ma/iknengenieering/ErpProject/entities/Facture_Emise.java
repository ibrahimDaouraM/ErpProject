package ma.iknengenieering.ErpProject.entities;



import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Facture Emise")
public class Facture_Emise  extends Facture{

	public Facture_Emise(String codeclient) {
		super();
		this.codeclient = codeclient;
	}

	public Facture_Emise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture_Emise(String nomSocieté, String adresse, Long tel, String reference, Date date) {
		super(nomSocieté, adresse, tel, reference, date);
		// TODO Auto-generated constructor stub
	}

	private String codeclient;

	public String getCodeclient() {
		return codeclient;
	}

	public void setCodeclient(String codeclient) {
		this.codeclient = codeclient;
	}
}
