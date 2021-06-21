package com.jee.gestion_mat_info.services;



import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jee.gestion_mat_info.models.fournisseur;
import com.jee.gestion_mat_info.repositories.fournisseurRepository;

@Service

public class fournisseurService {


	@Autowired
	private fournisseurRepository fournisseurRepository;
	
	//Get All fournisseur
	public List<fournisseur> findAll(){
		return fournisseurRepository.findAll();
	}	
	
	//Get fournisseur By Id
	public Optional<fournisseur> findById(Long id) {
		return fournisseurRepository.findById(id);
	}	
	
	//Delete Country
	public void delete(Long id) {
		fournisseurRepository.deleteById(id);
	}
	
	//Update fournisseur
	public void save( fournisseur fournisseur ) {
		fournisseurRepository.save(fournisseur);
	}

}

	
	
