package com.jee.gestion_mat_info.services;





import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jee.gestion_mat_info.models.colis;
import com.jee.gestion_mat_info.repositories.colisRepository;

@Service
public class colisService {
	
	@Autowired
	private colisRepository colisRepository;

	
	//Get All colis
		public List<colis> findAll(){
			return colisRepository.findAll();
		}	

	/*	//Delete colis
			public void delete(Long id) {
				colisRepository.deleteById(id);

		}	


			//Update colis
			public void save( colis colis) {
				colisRepository.save(colis);
			}
			
			//Get colis By Id
			public Optional<colis> findById(Long id) {
				return colisRepository.findById(id);
			}	
			
**/ 
}
