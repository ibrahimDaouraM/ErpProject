package ma.iknengenieering.ErpProject.entities;

public class Utilisateur {
	 private Long idUtilisateur;
	 private String status;
	 private String login;
	 private String password;
	 private boolean actived;
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(Long idUtilisateur, String status, String login, String password, boolean actived) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.status = status;
		this.login = login;
		this.password = password;
		this.actived = actived;
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
