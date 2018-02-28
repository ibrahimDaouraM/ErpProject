package ma.iknengenieering.ErpProject.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import ma.iknengenieering.ErpProject.dao.IModuleFactureDAO;
import ma.iknengenieering.ErpProject.entities.Client;
import ma.iknengenieering.ErpProject.entities.Facture;
import ma.iknengenieering.ErpProject.entities.Fournisseur;
import ma.iknengenieering.ErpProject.entities.Produit;
import ma.iknengenieering.ErpProject.entities.Role;
import ma.iknengenieering.ErpProject.entities.Utilisateur;
@Transactional
public class ModuleFactureMetierImpl implements IAdminMetier{
private IModuleFactureDAO dao;
	public void setDao(IModuleFactureDAO dao) {
	this.dao = dao;
}

	

	@Override
	public Long ajouterFacture(Facture f, Long refClient, Long refFourniseur) {
		
		return dao.ajouterFacture(f, refClient, refFourniseur);
	}

	@Override
	public void supprimerfacture(Long reference) {
		dao.supprimerfacture(reference);
		
	}

	@Override
	public void modifierfacture(Facture f) {
		dao.modifierfacture(f);
		
	}

	@Override
	public Facture getFacture(Long ref) {
		
		return dao.getFacture(ref);
	}

	@Override
	public List<Facture> listFacture() {
		
		return dao.listFacture();
	}

	@Override
	public List<Facture> factureParNature(String naturefacture) {
	
		return dao.factureParNature(naturefacture);
	}

	@Override
	public List<Facture> factureParClient(String nomclient) {
		
		return dao.factureParClient(nomclient);
	}

	@Override
	public List<Facture> factureParfournisseur(String fourniseur) {
		return dao.factureParfournisseur(fourniseur);
	}
	@Override
	public Long ajouterClient(Client c) {
		return dao.ajouterClient(c);
	}

	@Override
	public void supprimerClient(Long idClient) {
		dao.supprimerClient(idClient);
		
	}

	@Override
	public void modifierClient(Client c) {
		dao.modifierClient(c);
		
	}

	@Override
	public Client getClient(String nomClient) {
		return dao.getClient(nomClient);
	}

	@Override
	public Client getClient(Long idclient) {
		return dao.getClient(idclient);
	}

	@Override
	public List<Client> listClient() {
		return dao.listClient();
	}

	@Override
	public Long ajouterFournisseur(Fournisseur f) {
		return dao.ajouterFournisseur(f);
	}

	@Override
	public void supprimerFournisseur(Long idFournisseur) {
		dao.supprimerFournisseur(idFournisseur);
		
	}

	@Override
	public void modifierFournisseur(Fournisseur f) {
		dao.modifierFournisseur(f);
		
	}

	@Override
	public Fournisseur getFournisseur(String nomFournisseur) {
		return dao.getFournisseur(nomFournisseur);
	}

	@Override
	public Fournisseur getFournisseur(Long idFournisseur) {
		return dao.getFournisseur(idFournisseur);
	}

	@Override
	public List<Fournisseur > listFournisseur() {
		return dao.listFournisseur();
	}

	@Override
	public Long ajouterProduit(Produit p) {
		return dao.ajouterProduit(p);
	}

	@Override
	public List<Produit> listproduits() {
		return dao.listproduits();
	}

	@Override
	public List<Produit> produitsParMotCle(String mc) {
		return dao.produitsParMotCle(mc);
	}

	@Override
	public Produit getProduit(Long idP) {
		return dao.getProduit(idP);
	}

	@Override
	public void supprimerProduit(Long idP) {
		dao.supprimerProduit(idP);
		
	}

	@Override
	public void modifierProduit(Produit p) {
	dao.modifierProduit(p);
		
	}

	@Override
	public void ajouterUtilisateur(Utilisateur u) {
		dao.ajouterUtilisateur(u);
		
	}

	@Override
	public void attribuerRole(Role r, Long idUtilisateur) {
		dao.attribuerRole(r, idUtilisateur);
		
	}
	

}
