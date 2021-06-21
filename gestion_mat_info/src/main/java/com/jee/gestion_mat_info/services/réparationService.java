package com.jee.gestion_mat_info.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jee.gestion_mat_info.models.réparation;
import com.jee.gestion_mat_info.repositories.réparationRepository;

@Service
public class réparationService {

	
	

	@Autowired
	private  réparationRepository  réparationRepository;
	
	//Get All  réparation
	public List< réparation> findAll(){
		return  réparationRepository.findAll();
	}	
	
	//Get  réparation By Id
	public Optional< réparation> findById(Long id) {
		return  réparationRepository.findById(id);
	}	
	
	//Delete  réparation
	public void delete(Long id) {
		 réparationRepository.deleteById(id);
	}
	
	//Update  réparation
	public void save( réparation  réparation ) {
		 réparationRepository.save( réparation);
	}
}
