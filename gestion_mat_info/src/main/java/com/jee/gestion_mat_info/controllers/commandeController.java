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

import com.jee.gestion_mat_info.models.commande;
import com.jee.gestion_mat_info.services.commadeService;

import com.jee.gestion_mat_info.services.colisService;











@Controller
public class commandeController {
	

	@Autowired private commadeService commadeService;
	@Autowired private colisService colisService;
	
	
	
	

	@GetMapping("/commandes")
	public String getcommandes() {
		return "commande" ;
	}
			
	
	/*
	//Get All Clients
		@GetMapping("commandes")
		public String findAll(Model model){		
			model.addAttribute("commandes", commadeService.findAll());
			model.addAttribute("colis", colisService.findAll());
			return "commande" ;
			
		
	}	
	
		
		//Add client
		@PostMapping(value="commandes/addNew")
		public String addNew(commande commande) {
			commadeService.save(commande);
			return "redirect:/commandes";
		}	
		
		
		
		
		
		
		
		@RequestMapping("commandes/findById") 
		@ResponseBody
		public Optional<commande> findById(Long id)
		{
			return commadeService.findById(id);
			
		}
		
		
		
	@RequestMapping(value="commandes/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(commande commande) {
		commadeService.save(commande);
		return "redirect:/commandes";
	}

	@RequestMapping(value="commandes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Long id) {
		commadeService.delete(id);
		return "redirect:/commandes";
	}
**/
}
