package ma.iknengenieering.ErpProject.entities;

import java.util.Date;
public class Facture {
private String NomSociet�;
private String adresse;
private Long tel;

private String reference;
private Date date;
public Facture() {
	super();
	// TODO Auto-generated constructor stub
}
public Facture(String nomSociet�, String adresse, Long tel, String reference, Date date) {
	super();
	NomSociet� = nomSociet�;
	this.adresse = adresse;
	this.tel = tel;
	this.reference = reference;
	this.date = date;
}
public String getNomSociet�() {
	return NomSociet�;
}
public void setNomSociet�(String nomSociet�) {
	NomSociet� = nomSociet�;
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

}
