package ma.iknengenieering.ErpProject.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;



@Entity
@Table(name="produits")
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;
	@NotEmpty
	private String designation;
	  private String description;
	  private double prix;
	  private int quantite;
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	 public Long getIdProduit() {
			return idProduit;
		}
		public void setIdProduit(Long idProduit) {
			this.idProduit = idProduit;
		}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Produit(String designation, String description, double prix, int quantite) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
}
