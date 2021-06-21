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

import com.jee.gestion_mat_info.models.vente;
import com.jee.gestion_mat_info.services.venteService;












@Controller
public class venteController {
	

	@Autowired private venteService venteService;
	

	@GetMapping("/ventes")
	public String getventes() {
		return "vente" ;
	}
			
	/*
	//Get All ventes
		@GetMapping("ventes")
		public String findAll(Model model){		
			model.addAttribute("ventes", venteService.findAll());
			return "vente" ;
			
		
	}	
	
		
		//Add client
		@PostMapping(value="ventes/addNew")
		public String addNew(vente vente) {
			venteService.save(vente);
			return "redirect:/ventes";
		}	
		
		
		
		
		
		
		
		@RequestMapping("ventes/findById") 
		@ResponseBody
		public Optional<vente> findById(Long id)
		{
			return venteService.findById(id);
			
		}
		
		
		
	@RequestMapping(value="ventes/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(vente vente) {
		venteService.save(vente);
		return "redirect:/ventes";
	}

	@RequestMapping(value="ventes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Long id) {
		venteService.delete(id);
		return "redirect:/ventes";
	}
**/
}
