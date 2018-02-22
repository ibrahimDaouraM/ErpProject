package ma.iknengenieering.ErpProject.metier;

import java.util.List;

import ma.iknengenieering.ErpProject.entities.Client;
import ma.iknengenieering.ErpProject.entities.Utilisateur;

public interface AdminMetier {
	public Client ajouterClient(Client cl);
	public List<Client> listClient();
	public Utilisateur ajouterUtilisateur(Utilisateur u);
	public List<Utilisateur> listUtilisateur();

}
