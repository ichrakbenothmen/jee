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

import com.jee.gestion_mat_info.models.location;
import com.jee.gestion_mat_info.services.locationService;












@Controller
public class locationController {
	

	@Autowired private locationService locationService;
	

	@GetMapping("/locations")
	public String getlocations() {
		return "location" ;
	}
			  
	
	/*//Get All locations
		@GetMapping("locations")
		public String findAll(Model model){		
			model.addAttribute("locations", locationService.findAll());
			return "location" ;
			
		
	}	
	
		
		//Add location
		@PostMapping(value="locations/addNew")
		public String addNew(location location) {
			locationService.save(location);
			return "redirect:/locations";
		}	
		
		
		
		
		
		
		
		@RequestMapping("locations/findById") 
		@ResponseBody
		public Optional<location> findById(Long id)
		{
			return locationService.findById(id);
			
		}
		
		
		
	@RequestMapping(value="locations/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(location location) {
		locationService.save(location);
		return "redirect:/locations";
	}

	@RequestMapping(value="locations/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Long id) {
		locationService.delete(id);
		return "redirect:/clients";
	}
**/
}
