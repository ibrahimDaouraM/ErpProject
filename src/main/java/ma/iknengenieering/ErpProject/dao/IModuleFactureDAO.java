package ma.iknengenieering.ErpProject.dao;

import java.util.List;

import ma.iknengenieering.ErpProject.entities.*;

public interface IModuleFactureDAO {
	    /*----operation classique pour facture---------*/
	  public Long ajouterFacture(Facture f, Long refClient,Long refFourniseur);
	  public void supprimerfacture(Long reference);
	  public void modifierfacture(Facture f); 
	  public Facture getFacture(Long ref);
	  public List<Facture> listFacture();
	  public List<Facture> factureParNature(String naturefacture);
	  public List<Facture> factureParClient(String nomclient);
	  public List<Facture> factureParfournisseur(String fourniseur);
	  
	  /*----operation classique pour  client----------------*/
	   public Long ajouterClient(Client c);
	   public void supprimerClient(Long idClient);
	   public void modifierClient(Client c);
	   public Client getClient(String nomClient);
	   public Client getClient(Long idclient);
	   public List<Client> listClient();
	   
	   /*----operation classique pour Fournisseur----------------*/
	   public Long ajouterFournisseur(Fournisseur f);
	   public void supprimerFournisseur(Long idFournisseur);
	   public void modifierFournisseur(Fournisseur f);
	   public Fournisseur getFournisseur(String nomFournisseur);
	   public Fournisseur getFournisseur(Long idFournisseur);
	   public List<Fournisseur > listFournisseur();
	   
	   /*----operation classique pour produit----------------*/
	   public Long ajouterProduit(Produit  p);
	   public List<Produit> listproduits();
	   public List<Produit> produitsParMotCle(String mc);
	   public Produit getProduit(Long idP);
	   public void supprimerProduit(Long idP);
	   public void modifierProduit(Produit p); 
	   /*----operation pour utilisateur----------------*/
	   
	   public void ajouterUtilisateur(Utilisateur u);
	   public void attribuerRole(Role r,Long idUtilisateur);
	   
}
