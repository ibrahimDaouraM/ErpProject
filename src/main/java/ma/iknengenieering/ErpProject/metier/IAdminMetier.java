package ma.iknengenieering.ErpProject.metier;

import ma.iknengenieering.ErpProject.entities.Role;
import ma.iknengenieering.ErpProject.entities.Utilisateur;

public interface IAdminMetier extends IUtilisateurMetier {
	public void ajouterUtilisateur(Utilisateur u);
	   public void attribuerRole(Role r,Long idUtilisateur);
}
