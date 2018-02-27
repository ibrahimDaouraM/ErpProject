package ma.iknengenieering.ErpProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.iknengenieering.ErpProject.entities.Client;
import ma.iknengenieering.ErpProject.metier.IAdminMetier;

@Controller
@RequestMapping(value="/administrateur")
public class AdminController {
	@Autowired
private IAdminMetier metierAdmin;
	@RequestMapping(value="/index")
	public String index(Model model) {
		model.addAttribute("client", new Client());
		model.addAttribute("clients",metierAdmin.listClient());
		return "client";
		
	}
	@RequestMapping(value="/AjouterClient")
	public String ajouterlient(Client c,BindingResult bindingResult, Model model) {
		
		 if(bindingResult.hasErrors()) {
			 model.addAttribute("clients",metierAdmin.listClient());
			 return "client";
		 }
		 metierAdmin.ajouterClient(c);
		model.addAttribute("client", new Client());
		model.addAttribute("clients",metierAdmin.listClient());
		return "client";
		
	}
}
