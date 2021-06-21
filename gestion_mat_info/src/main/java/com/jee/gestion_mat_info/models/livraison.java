package com.jee.gestion_mat_info.models;

import java.util.List;

import javax.persistence.Entity;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





import lombok.EqualsAndHashCode;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class livraison extends service {

	private String date_livraison ;
	private String nom_livreur ;
	

	@ManyToOne
	@JoinColumn(name="ref_com", insertable=false, updatable=false)
	private commande commande ;
	private Long ref_com ; 
	
	

	@ManyToMany
	@JoinColumn(name="id", insertable=false, updatable=false)
    private List<client> clients;
	private Long  id;

    @ManyToMany
	@JoinColumn(name="ref_mat", insertable=false, updatable=false)
    private List<matériel> matériels;
	private Long  ref_mat;

}
	
