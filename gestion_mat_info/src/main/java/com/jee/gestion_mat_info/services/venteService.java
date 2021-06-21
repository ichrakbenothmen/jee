package com.jee.gestion_mat_info.services;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jee.gestion_mat_info.models.vente;
import com.jee.gestion_mat_info.repositories.venteRepository;

@Service
public class venteService {


	@Autowired
	private  venteRepository  venteRepository;
	
	//Get All  vente
	public List< vente> findAll(){
		return  venteRepository.findAll();
	}	
	
	//Get  vente By Id
	public Optional< vente> findById(Long id) {
		return  venteRepository.findById(id);
	}	
	
	//Delete  vente
	public void delete(Long id) {
		 venteRepository.deleteById(id);
	}
	
	//Update  vente
	public void save(  vente  vente ) {
		 venteRepository.save( vente);
	}

}

	
	
