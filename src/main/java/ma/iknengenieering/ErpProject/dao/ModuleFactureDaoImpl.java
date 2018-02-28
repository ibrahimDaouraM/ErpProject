package ma.iknengenieering.ErpProject.dao;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ma.iknengenieering.ErpProject.entities.Client;
import ma.iknengenieering.ErpProject.entities.Facture;
import ma.iknengenieering.ErpProject.entities.Fournisseur;
import ma.iknengenieering.ErpProject.entities.Produit;
import ma.iknengenieering.ErpProject.entities.Role;
import ma.iknengenieering.ErpProject.entities.Utilisateur;

public class ModuleFactureDaoImpl implements IModuleFactureDAO {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Long ajouterFacture(Facture f, Long refClient,Long refFourniseur) {
			Client c=getClient(refClient);
		    Fournisseur fn=getFournisseur(refFourniseur);
		           f.setClient(c);
		           f.setFournisseur(fn);
		           em.persist(f);
		return f.getIdFacture();
	}
	@Override
	public void supprimerfacture(Long reference) {
		Facture f=getFacture(reference);
		em.remove(f);
		
	}
	@Override
	public void modifierfacture(Facture f) {
		em.merge(f);
		
	}
	@Override
	public Facture getFacture(Long ref) {
		return em.find(Facture.class,ref);
	}
	@Override
	public List<Facture> listFacture() {
		Query req=em.createQuery("select f from Facture f");
		return req.getResultList();
	}
	@Override
	public List<Facture> factureParNature(String naturefacture) {
		Query req=em.createQuery("select f from Facture f where f.naturedeFacture like :x ");
		req.setParameter("x", "%"+naturefacture+"%");
		return req.getResultList();
	}
	@Override
	public List<Facture> factureParClient(String nomclient) {
		Query req=em.createQuery("select f from Facture f where f.naturedeFacture like :x ");
		req.setParameter("x", "%"+nomclient+"%");
		return req.getResultList();
	}
	@Override
	public List<Facture> factureParfournisseur(String fourniseur) {
		Query req=em.createQuery("select f from Facture f where f.naturedeFacture like :x ");
		req.setParameter("x", "%"+fourniseur+"%");
		return req.getResultList();
	}

	@Override
	public Long ajouterClient(Client c) {
		em.persist(c);
		return c.getIdClient();
	}
	@Override
	public void supprimerClient(Long idClient) {
		Client c=em.find(Client.class,idClient);
		em.remove(c);
		
	}
	@Override
	public void modifierClient(Client c) {
		em.merge(c);
	}
	@Override
	public Client getClient(String nomClient) {
		
		 return  em.find(Client.class, nomClient);
	}
	@Override
	public Client getClient(Long idclient) {
		
		return  em.find(Client.class, idclient);
	}
	@Override
	public List<Client> listClient() {
		Query req=em.createQuery("select c from Client c");
		return req.getResultList();
	}
	@Override
	public Long ajouterFournisseur(Fournisseur f) {
		em.persist(f);
		return f.getIdFournisseur();
	}
	@Override
	public void supprimerFournisseur(Long idFournisseur) {
		Fournisseur f=em.find(Fournisseur.class,idFournisseur);
		em.remove(f);
	}
	@Override
	public void modifierFournisseur(Fournisseur f) {
		em.merge(f);
		
	}
	@Override
	public Fournisseur getFournisseur(String nomFournisseur) {
		return  em.find(Fournisseur.class, nomFournisseur);
	}
	@Override
	public Fournisseur getFournisseur(Long idFournisseur) {
		return  em.find(Fournisseur.class, idFournisseur);
	}
	@Override
	public List<Fournisseur > listFournisseur() {
		Query req=em.createQuery("select f from Fournisseur f");
		return req.getResultList();
	}
	@Override
	public Long ajouterProduit(Produit p) {
		em.persist(p);
		return p.getIdProduit();
	}
	@Override
	public List<Produit> listproduits() {
		Query req=em.createQuery("select p from Produit p");
		return req.getResultList();
	}
	@Override
	public List<Produit> produitsParMotCle(String mc) {
		Query req=em.createQuery("select p from Produit p where p.designation like :x or p.description like :x");
		req.setParameter("x", "%"+mc+"%");
		return req.getResultList();
	}
	@Override
	public Produit getProduit(Long idP) {
		return  em.find(Produit.class, idP);
	}
	@Override
	public void supprimerProduit(Long idP) {
		Produit p=em.find(Produit.class,idP);
		em.remove(p);
	}
	@Override
	public void modifierProduit(Produit p) {
		em.merge(p);
		
	}
	@Override
	public void ajouterUtilisateur(Utilisateur u) {
		em.persist(u);
		
	}
	@Override
	public void attribuerRole(Role r, Long idUtilisateur) {
		Utilisateur u=em.find(Utilisateur.class, idUtilisateur);
		u.getRoles().add(r);
		em.persist(r);
		
	}

}
