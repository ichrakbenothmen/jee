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

import com.jee.gestion_mat_info.models.client;
import com.jee.gestion_mat_info.models.distribution;
import com.jee.gestion_mat_info.services.clientService;

 


@Controller
public class clientController {
	

	@Autowired private clientService clientService; 
	
/**
	@GetMapping("/clients")
	public String getclients() {
		return "client" ;
	}
*/
	@GetMapping("/clients")
	public String getclients( Model model) {
		
		List<client> clientList = clientService.getclients();
		model.addAttribute("clients" , clientList);
		
		return "client" ;
	}
					
	
	 
	/*
	
	//Get All Clients
		@GetMapping("clients")
		public String findAll(Model model){		
			model.addAttribute("clients", clientService.findAll());
			return "client" ;
			
		
	}**/	
	
		
		//Add client
		@PostMapping("/clients/addNew")
		public String addNew(client client) {
			clientService.save(client);
			return "redirect:/clients";
		}	
		
		
	
		
		
		
	
		@RequestMapping("clients/findById")  //find html page 
		@ResponseBody
		public Optional<client> findById(int id)
		{
			return clientService.findById(id);
			
		}
		
	
	
	@RequestMapping(value="clients/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(client client) {
		clientService.save(client);
		return "redirect:/clients";
	}

	@RequestMapping(value="clients/delete", method = {RequestMethod.DELETE, RequestMethod.GET})	
	public String delete(Integer id) {
		clientService.delete(id);
		return "redirect:/clients";
	}

}

