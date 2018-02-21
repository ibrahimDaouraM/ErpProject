package ma.iknengenieering.ErpProject.entities;


import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Clients")
public class Client implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Code_Client")
	private Long idClient;
	private String nomClient;
	private String adresse;
	private String email;
	private Long tel;
	/*@OneToMany(mappedBy="client")
	private Collection<Facture_Emise> factures;
	public Long getIdClient() {
		return idClient;
	}
	public Collection<Facture_Emise> getFactures() {
		return factures;
	}
	public void setFactures(Collection<Facture_Emise> factures) {
		this.factures = factures;
	}*/
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getTel() {
		return tel;
	}
	public void setTel(Long tel) {
		this.tel = tel;
	}
	public Client(Long idClient, String nomClient, String adresse, String email, Long tel) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
}
