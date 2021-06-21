package com.jee.gestion_mat_info.services;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.jee.gestion_mat_info.models.client;
import com.jee.gestion_mat_info.models.distribution;
import com.jee.gestion_mat_info.repositories.distributionRepository;

@Service
public class distributionService {
	

	@Autowired
	private distributionRepository distributionRepository;
	
	
	
	

	
	//Get All distribution
		public List< distribution> getdistributions(){
			return distributionRepository.findAll();
		}	

		
		
		
		//Get distribution By Id
		public Optional<distribution> findById(int id) {
			return distributionRepository.findById(id);
		}	
		
		//Delete distribution
		public void delete(int id) {
			distributionRepository.deleteById(id);
		}
	
		//Update distribution
		public void save( distribution distribution) {
			distributionRepository.save(distribution);
		}
		
		
	
}
