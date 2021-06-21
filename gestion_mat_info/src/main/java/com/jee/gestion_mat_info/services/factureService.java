package com.jee.gestion_mat_info.services;


import java.util.List;

import java.util.Optional;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jee.gestion_mat_info.repositories.factureRepository;


import com.jee.gestion_mat_info.models.facture;

@Service
public class factureService {

	@Autowired  
	factureRepository  factureRepository  ;
	
	//Get All factures
		public List<facture> findAll(){
			return factureRepository.findAll();
		}	
	
		
		
		//Get Client By Id
		public Optional<facture> findById(Long id) {
			return factureRepository.findById(id);
		}	
		

		//Delete facture
		public void delete(Long id) {
			factureRepository.deleteById(id);
		}	


		//Update Client
		public void save(facture facture ) {
			factureRepository.save(facture);
		}

		
		
}
	
	