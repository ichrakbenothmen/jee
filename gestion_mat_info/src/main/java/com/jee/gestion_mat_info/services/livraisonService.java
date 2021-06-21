package com.jee.gestion_mat_info.services;


import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jee.gestion_mat_info.models.livraison;
import com.jee.gestion_mat_info.repositories.livraisonRepository;

@Service

public class livraisonService {

	
	
	@Autowired
	private livraisonRepository livraisonRepository;
	
	//Get All livraisons
	public List<livraison> findAll(){
		return livraisonRepository.findAll();
	}	
	
	//Get Country By Id
	public Optional<livraison> findById(Long id) {
		return livraisonRepository.findById(id);
	}	
	
	//Delete Country
	public void delete(Long id) {
		livraisonRepository.deleteById(id);
	}
	

	//Update livraison
	public void save(  livraison livraison ) {
		livraisonRepository.save(livraison);
	}

	
}
