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
private String nomFournisseur;
private String adresseFournis;
private Long tel;
@OneToMany(mappedBy="fournisseur")
private Collection<Facture> factures;
public Fournisseur() {
	super();
	// TODO Auto-generated constructor stub
}
public Fournisseur(Long idFournisseur, String nomFournisseur, String adresseFournis, Long tel) {
	super();
	this.idFournisseur = idFournisseur;
	this.nomFournisseur = nomFournisseur;
	this.adresseFournis = adresseFournis;
	this.tel = tel;
}
public Long getIdFournisseur() {
	return idFournisseur;
}
public void setIdFournisseur(Long idFournisseur) {
	this.idFournisseur = idFournisseur;
}
public String getNomFournisseur() {
	return nomFournisseur;
}
public void setNomFournisseur(String nomFournisseur) {
	this.nomFournisseur = nomFournisseur;
}
public String getAdresseFournis() {
	return adresseFournis;
}
public void setAdresseFournis(String adresseFournis) {
	this.adresseFournis = adresseFournis;
}
public Long getTel() {
	return tel;
}
public void setTel(Long tel) {
	this.tel = tel;
}
public Collection<Facture> getFactures() {
	return factures;
}
public void setFactures(Collection<Facture> factures) {
	this.factures = factures;
}


}