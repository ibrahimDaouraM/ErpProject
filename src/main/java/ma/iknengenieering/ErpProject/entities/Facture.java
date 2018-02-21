package ma.iknengenieering.ErpProject.entities;



import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Facture",discriminatorType=DiscriminatorType.STRING)
@Table(name="Factures")
public class Facture implements Serializable {
	@Id
	@GeneratedValue
private Long idFacture;
private String NomSocieté;
private String adresse;
private Long tel;
private String reference;
private Date date;
@OneToMany(mappedBy="facture")
private Collection<Produit> produit;


@ManyToOne
@JoinColumn(name="ID_Utilisateur")
private Utilisateur utilisatuer;

public Collection<Produit> getProduit() {
	return produit;
}
public void setProduit(Collection<Produit> produit) {
	this.produit = produit;
}
public Utilisateur getUtilisatuer() {
	return utilisatuer;
}
public void setUtilisatuer(Utilisateur utilisatuer) {
	this.utilisatuer = utilisatuer;
}
public Facture() {
	super();
	// TODO Auto-generated constructor stub
}
public Facture(String nomSocieté, String adresse, Long tel, String reference, Date date) {
	super();
	NomSocieté = nomSocieté;
	this.adresse = adresse;
	this.tel = tel;
	this.reference = reference;
	this.date = date;
}
public String getNomSocieté() {
	return NomSocieté;
}
public void setNomSocieté(String nomSocieté) {
	NomSocieté = nomSocieté;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}

public String getReference() {
	return reference;
}
public void setReference(String reference) {
	this.reference = reference;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Long getTel() {
	return tel;
}
public void setTel(Long tel) {
	this.tel = tel;
}
public Long getIdFacture() {
	return idFacture;
}
public void setIdFacture(Long idFacture) {
	this.idFacture = idFacture;
}
}
