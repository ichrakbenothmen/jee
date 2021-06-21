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

import com.jee.gestion_mat_info.models.matériel;
import com.jee.gestion_mat_info.services.commadeService;
import com.jee.gestion_mat_info.services.matérielService;












@Controller
public class matérielController {
	

	@Autowired private matérielService matérielService;
	@Autowired private commadeService commadeService;

	/*  
	
	//Get All matériels
		@GetMapping("matériels")
		public String findAll(Model model){		
			model.addAttribute("matériels", matérielService.findAll());
			model.addAttribute("commandes", commadeService.findAll());

			return "matériel" ;
			
		
	}	
	
		
		//Add matériel
		@PostMapping(value="matériels/addNew")
		public String addNew(matériel matériel) {
			matérielService.save(matériel);
			return "redirect:/matériels";
		}	
		
		
		**/
		
		@GetMapping("/matériels")
		public String getmatériels() {
			return "matériel" ;
		}
				
		
		
	/*	@RequestMapping("matériels/findById") 
		@ResponseBody
		public Optional<matériel> findById(Long id)
		{
			return matérielService.findById(id);
			
		}
		
		
		
	@RequestMapping(value="matériels/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(matériel matériel ) {
		matérielService.save(matériel);
		return "redirect:/matériels";
	}

	@RequestMapping(value="matériels/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Long id) {
		matérielService.delete(id);
		return "redirect:/matériels";
	}
**/
}
