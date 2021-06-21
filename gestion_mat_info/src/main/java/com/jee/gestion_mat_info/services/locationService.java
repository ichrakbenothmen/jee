package com.jee.gestion_mat_info.services ;



import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jee.gestion_mat_info.models.location;
import com.jee.gestion_mat_info.repositories.locationRepository;

@Service
public class locationService {

	

	@Autowired
	private locationRepository locationRepository;
	
	//Get All location
	public List<location> findAll(){
		return locationRepository.findAll();
	}	
	
	//Get location By Id
	public Optional<location> findById(Long id) {
		return locationRepository.findById(id);
	}	
	
	//Delete location
	public void delete(Long id) {
		locationRepository.deleteById(id);
	}
	
	//Update location
	public void save( location location ) {
		locationRepository.save(location);
	}


}
