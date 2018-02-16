package ma.iknengenieering.ErpProject.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="Factures")
public class Facture {
	@Id
	@GeneratedValue
private Long idFacture;
@NotEmpty
private String NomSocieté;
private String adresse;
private Long tel;
@NotEmpty
private String reference;
@NotEmpty
private Date date;
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
