package ma.iknengenieering.ErpProject.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import ma.iknengenieering.ErpProject.entities.Fournisseur;
import ma.iknengenieering.ErpProject.entities.Produit;
import ma.iknengenieering.ErpProject.metier.IAdminMetier;

@Controller
@RequestMapping(value="/administrateur")
public class AdminControllerProduit {
	@Autowired
private IAdminMetier metierAdmin;
	@RequestMapping(value="/index2")
	public String index(Model model) {
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits",metierAdmin.listproduits());
		return "produit";
		
	}
	@RequestMapping(value="/AjouterProduit")
	public String ajouterproduit(@Valid Produit p,BindingResult bindingResult, Model model) {
		
		 if(bindingResult.hasErrors()) {
			 model.addAttribute("produits",metierAdmin.listproduits());
			 return ("produit");
		 }
		 
		 
		metierAdmin.ajouterProduit(p);
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits",metierAdmin.listproduits());
		return "produit";
	}
	@RequestMapping(value="/suppProduit")
	public String suppProd(Long idProduit,Model model){
		 metierAdmin.supprimerProduit(idProduit);
		 model.addAttribute("produit", new Produit());
		model.addAttribute("produits",metierAdmin.listproduits());
		 return "produit";
	}
	@RequestMapping(value="/modifProduit")
	public String modifProd(Long idProduit,Model model){
		Produit p=metierAdmin.getProduit(idProduit);
		 model.addAttribute("produit", p);
	     model.addAttribute("produits",metierAdmin.listproduits());
		 return "produit";
	}
}
