package com.jee.gestion_mat_info.controllers;

import java.util.List;
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

import com.jee.gestion_mat_info.models.colis;
import com.jee.gestion_mat_info.services.colisService;
import com.jee.gestion_mat_info.services.distributionService;



@Controller
public class colisController {
	
	@Autowired private colisService colisService;

	@Autowired private distributionService distributionService;

/*
	@GetMapping("/colis")
	public String getcolis() {
		return "colis" ;
	}
	**/ 		
	
	//Get All colis
		@GetMapping("/colis")
		public String findAll(Model model){	
			List<colis> colisList = colisService.findAll() ;
			model.addAttribute("colis" , colisList) ;
		//	model.addAttribute("distribution", distributionService.findAll());

			return "colis" ;
			
		
	}	
	
		/*
		//Add colis
		@PostMapping(value="colis/addNew")
		public String addNew(colis colis ) {
			colisService.save(colis);
			return "redirect:/colis";
		}	
		
		
		
		
		
		
		
		@RequestMapping("colis/findById") 
		@ResponseBody
		public Optional<colis> findById(Long id)
		{
			return colisService.findById(id);
			
		}
		
		
		
	@RequestMapping(value="colis/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(colis colis) {
		colisService.save(colis);
		return "redirect:/colis";
	}

	@RequestMapping(value="colis/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Long id) {
		colisService.delete(id);
		return "redirect:/colis";
	}
**/
}
