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

import com.jee.gestion_mat_info.models.employé;
import com.jee.gestion_mat_info.services.employéService;
import com.jee.gestion_mat_info.services.réparationService;
import com.jee.gestion_mat_info.services.livraisonService;
import com.jee.gestion_mat_info.services.locationService;
import com.jee.gestion_mat_info.services.venteService;












@Controller
public class employéController {
	

	@Autowired private employéService employéService;
	@Autowired private réparationService réparationService;
	@Autowired private locationService locationService;
	@Autowired private venteService venteService;
	@Autowired private livraisonService livraisonService;

	

	@GetMapping("/employés")
	public String getemployés() {
		return "employé" ;
	}
			
	
	  
	/*
	//Get All Clients
		@GetMapping("employés")
		public String findAll(Model model){		
			model.addAttribute("employés", employéService.findAll());
			model.addAttribute("réparations", réparationService.findAll());
			model.addAttribute("locations", locationService.findAll());
			model.addAttribute("livraisons", livraisonService.findAll());
			model.addAttribute("ventes", venteService.findAll());

			return "employé" ;
			
		
	}	
	
		
		//Add employé
		@PostMapping(value="employés/addNew")
		public String addNew(employé employé) {
			employéService.save(employé);
			return "redirect:/employés";
		}	
		
		
		
		
		
		
		
		@RequestMapping("employés/findById") 
		@ResponseBody
		public Optional<employé> findById(Long id)
		{
			return employéService.findById(id);
			
		}
		
		
		
	@RequestMapping(value="employés/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(employé employé) {
		employéService.save(employé);
		return "redirect:/employés";
	}

	@RequestMapping(value="employés/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Long id) {
		employéService.delete(id);
		return "redirect:/employés";
	}
**/
}
