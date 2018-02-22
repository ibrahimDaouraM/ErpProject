package ma.iknengenieering.ErpProject.entities;


import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Fournisseurs")
public class Fournisseur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Code_fournisseur")
private Long idFournisseur;
private String NomFournisseur;
private String adresseFournis;
private Long Tel;
@OneToMany(mappedBy="fournisseur")
private Collection<Facture> factures;

public Collection<Facture> getFactures() {
	return factures;
}
public void setFactures(Collection<Facture> factures) {
	this.factures = factures;
}
public Long getIdFournisseur() {
	return idFournisseur;
}
public void setIdFournisseur(Long idFournisseur) {
	this.idFournisseur = idFournisseur;
}
public String getNomFournisseur() {
	return NomFournisseur;
}
public void setNomFournisseur(String nomFournisseur) {
	NomFournisseur = nomFournisseur;
}
public String getAdresseFournis() {
	return adresseFournis;
}
public void setAdresseFournis(String adresseFournis) {
	this.adresseFournis = adresseFournis;
}
public Long getTel() {
	return Tel;
}
public void setTel(Long tel) {
	Tel = tel;
}
public Fournisseur(Long idFournisseur, String nomFournisseur, String adresseFournis, Long tel) {
	super();
	this.idFournisseur = idFournisseur;
	NomFournisseur = nomFournisseur;
	this.adresseFournis = adresseFournis;
	Tel = tel;
}
public Fournisseur() {
	super();
	// TODO Auto-generated constructor stub
}

}
