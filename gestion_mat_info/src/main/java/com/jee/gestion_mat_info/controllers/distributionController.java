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

import com.jee.gestion_mat_info.models.distribution;
import com.jee.gestion_mat_info.services.distributionService;












@Controller
public class distributionController {
	

	@Autowired private distributionService distributionService;
	

	@GetMapping("/distributions")
	public String getdistributions( Model model) {
		
		List<distribution> distributionList = distributionService.getdistributions();
		model.addAttribute("distributions" , distributionList);
		
		return "distribution" ;
	}
			
	
	
	/*  
	
	//Get All distributions
		@GetMapping("distributions")
		public String findAll(Model model){		
			model.addAttribute("distributions", distributionService.findAll());
			return "distribution" ;
	**/		
		
	
	
		
		//Add client
		@PostMapping("/distributions/addNew")
		public String addNew(distribution distribution ) {
			distributionService.save(distribution);
			return "redirect:/distributions";
		}	
		
		
		
	
		
		
		@RequestMapping("distributions/findById") 
		@ResponseBody
		public Optional<distribution> findById(int id)
		{
			return distributionService.findById(id);
			
		}
		
		
	
	@RequestMapping(value="distributions/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(distribution distribution) {
		distributionService.save(distribution);
		return "redirect:/distributions";
	}

	@RequestMapping(value="distributions/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer  id) {
		distributionService.delete(id);
		return "redirect:/distributions";
		
	}
 
}
