package com.jee.gestion_mat_info.services;


import java.util.List;

import java.util.Optional;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.jee.gestion_mat_info.repositories.clientRepository;


import com.jee.gestion_mat_info.models.client;

@Service
public class clientService {

	@Autowired  //
	 private clientRepository  clientRepository  ;
	
	//Get All Clients
		public List<client> getclients(){
			return clientRepository.findAll();
		}	
	
		
		
		
		
		
	
		//Get Client By Id
		public Optional<client> findById(int id) {
			return clientRepository.findById(id);
		}	
		

		//Delete Client
		public void delete(int  id) {
			clientRepository.deleteById(id);
		}	


		//Update Client
		public void save( client client) {
			clientRepository.save(client);
		}

		
		
}
	
	