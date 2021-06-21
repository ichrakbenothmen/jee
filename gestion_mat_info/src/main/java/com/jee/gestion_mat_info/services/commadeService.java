package com.jee.gestion_mat_info.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jee.gestion_mat_info.models.commande;
import com.jee.gestion_mat_info.repositories.commandeRepository;

@Service
public class commadeService {


	@Autowired
	private commandeRepository commandeRepository;

	//Get All commande
			public List<commande> findAll(){
				return commandeRepository.findAll();
			}	
			
			//Get commande By Id
			public Optional<commande> findById(Long id) {
				return commandeRepository.findById(id);
			}	
			
			//Delete commande
			public void delete(Long id) {
				commandeRepository.deleteById(id);
			}
			
			//Update commande
			public void save( commande commande) {
				commandeRepository.save(commande);
			}
			

			
			
}


