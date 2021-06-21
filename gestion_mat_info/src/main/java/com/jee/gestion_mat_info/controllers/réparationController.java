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

import com.jee.gestion_mat_info.models.réparation;
import com.jee.gestion_mat_info.services.réparationService;












@Controller
public class réparationController {
	

	@Autowired private réparationService réparationService;
	

	@GetMapping("/réparations")
	public String getréparations() {
		return "réparation" ;
	}
			  
/*	
	//Get All Clients
		@GetMapping("réparations")
		public String findAll(Model model){		
			model.addAttribute("réparations", réparationService.findAll());
			return "réparation" ;
			
		
	}	
	
		
		//Add client
		@PostMapping(value="réparations/addNew")
		public String addNew(réparation réparation) {
			réparationService.save(réparation);
			return "redirect:/réparations";
		}	
		
		
		
		
		
		
		
		@RequestMapping("réparations/findById") 
		@ResponseBody
		public Optional<réparation> findById(Long id)
		{
			return réparationService.findById(id);
			
		}
		
		
		
	@RequestMapping(value="réparations/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(réparation réparation) {
		réparationService.save(réparation);
		return "redirect:/réparations";
	}

	@RequestMapping(value="réparations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Long id) {
		réparationService.delete(id);
		return "redirect:/réparations";
	}
**/
}
