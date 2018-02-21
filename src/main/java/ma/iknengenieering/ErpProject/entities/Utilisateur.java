package ma.iknengenieering.ErpProject.entities;


import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Utilisateurs")
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	@Column(name="ID_Utilisateur")
	 private Long idUtilisateur;
	private String NomUtilisateur;
	 private String status;
	 private String login;
	 private String password;
	 private boolean actived;
	 @OneToMany
	  @JoinColumn(name="ID_Utilisateur")
	 private Collection<Role> roles;
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(Long idUtilisateur, String Nomutilisateur ,String status, String login, String password, boolean actived) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.NomUtilisateur = Nomutilisateur;
		this.status = status;
		this.login = login;
		this.password = password;
		this.actived = actived;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public String getNomUtilisateur() {
		return NomUtilisateur;
	}
	public void setNomUtilisateur(String nomUtilisateur) {
		NomUtilisateur = nomUtilisateur;
	}
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
}
