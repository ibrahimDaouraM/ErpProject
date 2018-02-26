package ma.iknengenieering.ErpProject.entities;




import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Factures")
public class Facture implements Serializable {
	@Id
	@GeneratedValue
private Long idFacture;
@Column(name="Reference_Facture")
private String reference;
@Column(name="Nom_societé")
private String nomSociete;
private String adresse;
private Double tva;
@Column(name="Telephonne")
private Long tel;
private Date date;
@Column(name="Nature_de_facture")
private String naturedeFacture;
@OneToMany(mappedBy="facture")
private Collection<Produit> produit;
@ManyToOne
@JoinColumn(name="Reference_Fournisseur")
private Fournisseur fournisseur;
@ManyToOne
@JoinColumn(name="Reference_Client")
private Client client;

public Facture() {
	super();
	// TODO Auto-generated constructor stub
}

public Facture(String reference, String nomSociete, String adresse, Double tva, Long tel, Date date,
		String naturedeFacture) {
	super();
	this.reference = reference;
	this.nomSociete = nomSociete;
	this.adresse = adresse;
	this.tva = tva;
	this.tel = tel;
	this.date = date;
	this.naturedeFacture = naturedeFacture;
}

public Long getIdFacture() {
	return idFacture;
}

public void setIdFacture(Long idFacture) {
	this.idFacture = idFacture;
}

public String getReference() {
	return reference;
}

public void setReference(String reference) {
	this.reference = reference;
}

public String getNomSociete() {
	return nomSociete;
}

public void setNomSociete(String nomSociete) {
	this.nomSociete = nomSociete;
}

public String getAdresse() {
	return adresse;
}

public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public Double getTva() {
	return tva;
}

public void setTva(Double tva) {
	this.tva = tva;
}

public Long getTel() {
	return tel;
}

public void setTel(Long tel) {
	this.tel = tel;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public String getNaturedeFacture() {
	return naturedeFacture;
}

public void setNaturedeFacture(String naturedeFacture) {
	this.naturedeFacture = naturedeFacture;
}

public Collection<Produit> getProduit() {
	return produit;
}

public void setProduit(Collection<Produit> produit) {
	this.produit = produit;
}

public Fournisseur getFournisseur() {
	return fournisseur;
}

public void setFournisseur(Fournisseur fournisseur) {
	this.fournisseur = fournisseur;
}

public Client getClient() {
	return client;
}

public void setClient(Client client) {
	this.client = client;
}


}
