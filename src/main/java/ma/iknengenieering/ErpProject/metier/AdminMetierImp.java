package ma.iknengenieering.ErpProject.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.iknengenieering.ErpProject.dao.ClientRepository;
import ma.iknengenieering.ErpProject.dao.UtilisateurRepository;
import ma.iknengenieering.ErpProject.entities.Client;
import ma.iknengenieering.ErpProject.entities.Utilisateur;
@Service
public class AdminMetierImp  implements AdminMetier{
	@Autowired
private ClientRepository clientRepository;
	@Autowired
private UtilisateurRepository utlisateurRepository;
	@Override
	public Client ajouterClient(Client cl) {
		// TODO Auto-generated method stub
		return clientRepository.save(cl);
	}

	@Override
	public List<Client> listClient() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	@Override
	public Utilisateur ajouterUtilisateur(Utilisateur u) {
		// TODO Auto-generated method stub
		return utlisateurRepository.save(u);
	}

	@Override
	public List<Utilisateur> listUtilisateur() {
		// TODO Auto-generated method stub
		return utlisateurRepository.findAll();
	}
 
}
