package com.jee.gestion_mat_info.controllers;

import java.util.Optional

;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jee.gestion_mat_info.models.fournisseur;
import com.jee.gestion_mat_info.services.fournisseurService;












@Controller
public class fournisseurController {
	

	@Autowired private fournisseurService fournisseurService;
	
	

	@GetMapping("/fournisseurs")
	public String getfournisseurs() {
		return "fournisseur" ;
	}
			
	
/*	  
	
	//Get All fournisseurs
		@GetMapping("fournisseurs")
		public String findAll(Model model){		
			model.addAttribute("fournisseurs", fournisseurService.findAll());
			return "fournisseur" ;
			
		
	}	
	
		
		//Add fournisseur
		@PostMapping(value="fournisseurs/addNew")
		public String addNew(fournisseur fournisseur) {
			fournisseurService.save(fournisseur);
			return "redirect:/fournisseurs";
		}	
		
		
		
		
		
		
		
		@RequestMapping("fournisseurs/findById") 
		@ResponseBody
		public Optional<fournisseur> findById(Long id)
		{
			return fournisseurService.findById(id);
			
		}
		
		
		
	@RequestMapping(value="fournisseurs/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(fournisseur fournisseur) {
		fournisseurService.save(fournisseur);
		return "redirect:/fournisseurs";
	}

	@RequestMapping(value="fournisseurs/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Long id) {
		fournisseurService.delete(id);
		return "redirect:/fournisseurs";
	}
**/
}
