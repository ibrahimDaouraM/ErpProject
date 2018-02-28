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

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Fournisseurs")
public class Fournisseur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Code_fournisseur")
private Long idFournisseur;
	@NotEmpty
private String codeFournisseur;
	@NotEmpty
private String nomFournisseur;
	@NotEmpty
private String prenomFournisseur;
	@NotEmpty
private String adresseFournis;
private String email;
@NotEmpty
private String tel;


@OneToMany(mappedBy="fournisseur")
private Collection<Facture> factures;
public Fournisseur() {
	super();
	// TODO Auto-generated constructor stub
}

public Fournisseur(String codeFournisseur, String nomFournisseur, String prenomFournisseur, String adresseFournis,
		String email, String tel) {
	super();
	this.codeFournisseur = codeFournisseur;
	this.nomFournisseur = nomFournisseur;
	this.prenomFournisseur = prenomFournisseur;
	this.adresseFournis = adresseFournis;
	this.email = email;
	this.tel = tel;
}

public String getCodeFournisseur() {
	return codeFournisseur;
}

public void setCodeFournisseur(String codeFournisseur) {
	this.codeFournisseur = codeFournisseur;
}

public String getPrenomFournisseur() {
	return prenomFournisseur;
}

public void setPrenomFournisseur(String prenomFournisseur) {
	this.prenomFournisseur = prenomFournisseur;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public void setTel(String tel) {
	this.tel = tel;
}
public String getTel() {
	return tel;
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
public void setFactures(Collection<Facture> factures) {
	this.factures = factures;
}


public Collection<Facture> getFactures() {
	return factures;
}
}