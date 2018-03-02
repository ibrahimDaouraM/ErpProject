package ma.iknengenieering.ErpProject.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.iknengenieering.ErpProject.entities.Facture;
import ma.iknengenieering.ErpProject.entities.Fournisseur;
import ma.iknengenieering.ErpProject.entities.Produit;
import ma.iknengenieering.ErpProject.metier.IAdminMetier;

@Controller
@RequestMapping(value="/administrateur")
public class AdminControllerFacture {
	@Autowired
private IAdminMetier metierAdmin;
	@RequestMapping(value="/index3")
	public String index(Model model) {
		
		
		model.addAttribute("facture", new Facture());
		model.addAttribute("factures",metierAdmin.listFacture());
		model.addAttribute("clients",metierAdmin.listClient());
		model.addAttribute("fournisseurs",metierAdmin.listFournisseur());
		
		return "facture";
		
	}
	@RequestMapping(value="/AjouterFacture")
	public String ajouterfacture(@Valid Facture f,BindingResult bindingResult, Model model) {
		
		 if(bindingResult.hasErrors()) {
			 model.addAttribute("factures",metierAdmin.listFacture());
			 model.addAttribute("clients",metierAdmin.listClient());
			 model.addAttribute("fournisseurs",metierAdmin.listFournisseur());
			 return "facture";
		 }
		 metierAdmin.ajouterFacture(f, f.getClient().getIdClient(), f.getFournisseur().getIdFournisseur());
		model.addAttribute("facture", new Facture());
		model.addAttribute("factures",metierAdmin.listFacture());
		model.addAttribute("clients",metierAdmin.listClient());
		model.addAttribute("fournisseurs",metierAdmin.listFournisseur());
		return "facture";
	}
	@RequestMapping(value="/suppFacture")
	public String suppFactu(Long idFacture ,Model model){
		 metierAdmin.supprimerfacture(idFacture);
		 model.addAttribute("facture", new Facture());
		 model.addAttribute("factures",metierAdmin.listFacture());
		 model.addAttribute("clients",metierAdmin.listClient());
		 model.addAttribute("fournisseurs",metierAdmin.listFournisseur());
		 return "facture";
	}
	@RequestMapping(value="/modifFacture")
	public String modifFac(Long idFacture,Model model){
		Facture f=metierAdmin.getFacture(idFacture);
		 model.addAttribute("facture", f);
		 model.addAttribute("factures",metierAdmin.listFacture());
		 model.addAttribute("clients",metierAdmin.listClient());
		 model.addAttribute("fournisseurs",metierAdmin.listFournisseur());
		 return "facture";
	}
}
