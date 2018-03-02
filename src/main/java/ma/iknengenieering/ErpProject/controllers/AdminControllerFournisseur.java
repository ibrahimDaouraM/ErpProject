package ma.iknengenieering.ErpProject.controllers;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import ma.iknengenieering.ErpProject.entities.Fournisseur;
import ma.iknengenieering.ErpProject.metier.IAdminMetier;

@Controller
@RequestMapping(value="/administrateur")
public class AdminControllerFournisseur {
	@Autowired
private IAdminMetier metierAdmin;
	@RequestMapping(value="/index1")
	public String index(Model model) {
		model.addAttribute("fournisseur", new Fournisseur());
		model.addAttribute("fournisseurs",metierAdmin.listFournisseur());
		return "fournisseur";
		
	}
	@RequestMapping(value="/AjouterFournisseur")
	public String ajouterfournis(@Valid Fournisseur f,BindingResult bindingResult, Model model) {
		
		 if(bindingResult.hasErrors()) {
			 model.addAttribute("fournisseurs",metierAdmin.listFournisseur());
			 return "fournisseur";
		 }
		 metierAdmin.ajouterFournisseur(f);
		model.addAttribute("fournisseur", new Fournisseur());
		model.addAttribute("fournisseurs",metierAdmin.listFournisseur());
		return "fournisseur";
	}
	@RequestMapping(value="/suppFournisseur")
	public String suppfour(Long idFournisseur,Model model){
		 metierAdmin.supprimerFournisseur(idFournisseur);
		 model.addAttribute("fournisseur", new Fournisseur());
		model.addAttribute("fournisseurs",metierAdmin.listFournisseur());
		 return "fournisseur";
	}
	@RequestMapping(value="/modifFournisseur")
	public String modif(Long idFournisseur,Model model){
		 Fournisseur f=metierAdmin.getFournisseur(idFournisseur);
		 model.addAttribute("fournisseur", f);
	     model.addAttribute("fournisseurs",metierAdmin.listFournisseur());
		 return "fournisseur";
	}
}
