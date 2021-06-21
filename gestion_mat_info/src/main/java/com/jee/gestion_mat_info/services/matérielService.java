package com.jee.gestion_mat_info.services;




import java.util.List;

import java.util.Optional;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jee.gestion_mat_info.repositories.matérielRepository;


import com.jee.gestion_mat_info.models.matériel;

@Service
public class matérielService {
	
	@Autowired  
	matérielRepository  matérielRepository  ;
	
	//Get All matériels
		public List<matériel> findAll(){
			return matérielRepository.findAll();
		}	
	
		
		
		//Get matériel By Id
		public Optional<matériel> findById(Long id) {
			return matérielRepository.findById(id);
		}	
		

		//Delete matériel
		public void delete(Long id) {
			matérielRepository.deleteById(id);
		}	


		//Update matériel
		public void save( matériel matériel) {
			matérielRepository.save(matériel);
		}

		
		
}
	



