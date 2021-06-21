package com.jee.gestion_mat_info.controllers;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jee.gestion_mat_info.models.facture;
import com.jee.gestion_mat_info.services.clientService;
import com.jee.gestion_mat_info.services.factureService;
import com.jee.gestion_mat_info.services.livraisonService;
import com.jee.gestion_mat_info.services.locationService;
import com.jee.gestion_mat_info.services.réparationService;
import com.jee.gestion_mat_info.services.venteService;












@Controller
public class factureController {
	

	@Autowired private factureService factureService;
	@Autowired private clientService clientService;
	@Autowired private réparationService réparationService;
	@Autowired private locationService locationService;
	@Autowired private venteService venteService;
	@Autowired private livraisonService livraisonService;


	@GetMapping("/factures")
	public String getfactures() {
		return "facture" ;
	}
			 
	
/*	//Get All factures
		@GetMapping("factures")
		public String findAll(Model model){		
			model.addAttribute("factures", factureService.findAll());
			model.addAttribute("clients", clientService.findAll());
			model.addAttribute("réparations", réparationService.findAll());
			model.addAttribute("locations", locationService.findAll());
			model.addAttribute("livraisons", livraisonService.findAll());
			model.addAttribute("ventes", venteService.findAll());
			return "facture" ;
			
		
	}	
	
		
		//Add facture
		@PostMapping(value="factures/addNew")
		public String addNew(facture facture) {
			factureService.save(facture);
			return "redirect:/factures";
		}	
		
		
		
		
		
		
		
		@RequestMapping("factures/findById") 
		@ResponseBody
		public Optional<facture> findById(Long id)
		{
			return factureService.findById(id);
			
		}
		
		
		
	@RequestMapping(value="factures/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(facture facture) {
		factureService.save(facture);
		return "redirect:/factures";
	}

	@RequestMapping(value="factures/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Long id) {
		factureService.delete(id);
		return "redirect:/factures";
	}
**/
}
