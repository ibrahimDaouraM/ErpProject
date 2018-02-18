package ma.iknengenieering.ErpProject.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("Facture Emise")
public class Facture_Emise  extends Facture{

	@ManyToOne
	@JoinColumn(name="ID_client")
	private Client client;

	public Facture_Emise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facture_Emise(String nomSocieté, String adresse, Long tel, String reference, Date date) {
		super(nomSocieté, adresse, tel, reference, date);
		// TODO Auto-generated constructor stub
	}

	public Facture_Emise(Client client) {
		super();
		this.client = client;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
