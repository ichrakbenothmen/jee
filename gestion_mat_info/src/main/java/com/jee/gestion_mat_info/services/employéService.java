package com.jee.gestion_mat_info.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jee.gestion_mat_info.models.employé;
import com.jee.gestion_mat_info.repositories.employéRepository;


@Service
public class employéService {
	
	@Autowired
	private employéRepository employéRepository;
	

	//Get All employé
	public List< employé> findAll(){
		return employéRepository.findAll();
	}	
	
	
	
	//Get employé By Id
	public Optional<employé> findById(Long id) {
		return employéRepository.findById(id);
	}	
	
	
	//Delete employé
	public void delete(Long id) {
		employéRepository.deleteById(id);
	}
	
	//Update employé
	public void save( employé employé) {
		employéRepository.save(employé);
	}
	
}
