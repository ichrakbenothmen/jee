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

import com.jee.gestion_mat_info.models.livraison;
import com.jee.gestion_mat_info.services.commadeService;
import com.jee.gestion_mat_info.services.livraisonService;













@Controller
public class livraisonController {
	

	@Autowired private livraisonService livraisonService;
	
	@Autowired private commadeService commadeService;

	
	

	@GetMapping("/livraisons")
	public String getlivraisons() {
		return "livraison" ;
	}
			
	/*
	//Get All livraisons
		@GetMapping("livraisons")
		public String findAll(Model model){		
			
			model.addAttribute("livraisons", livraisonService.findAll());
			model.addAttribute("commandes", commadeService.findAll());

			return "livraison" ;
			
		
	}	
	
		
		//Add livraison
		@PostMapping(value="livraisons/addNew")
		public String addNew(livraison livraison) {
			livraisonService.save(livraison);
			return "redirect:/livraisons";
		}	
		
		
		
		
		
		
		
		@RequestMapping("livraisons/findById") 
		@ResponseBody
		public Optional<livraison> findById(Long id)
		{
			return livraisonService.findById(id);
			
		}
		
		
		
	@RequestMapping(value="livraisons/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(livraison livraison) {
		livraisonService.save(livraison);
		return "redirect:/livraisons";
	}

	@RequestMapping(value="livraisons/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Long id) {
		livraisonService.delete(id);
		return "redirect:/livraisons";
	}
**/
}
