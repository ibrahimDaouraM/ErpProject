package ma.iknengenieering.ErpProject.entities;

public class Fournisseur {
private Long idFournisseur;
private String NomFournisseur;
private String adresseFournis;
private Long Tel;
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
