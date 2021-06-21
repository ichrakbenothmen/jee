package com.jee.gestion_mat_info.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Data 
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class commande {

	
	@Id
	  @GeneratedValue (strategy = GenerationType.IDENTITY)

	private int  id ;
	private String date_com ;
	
	@ManyToOne 
	@JoinColumn(name="ref_colis" , insertable=false , updatable=false )
	private colis colis ;
	private Long ref_colis ;
	
}
