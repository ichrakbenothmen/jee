package com.jee.gestion_mat_info.models;

import javax.persistence.Entity;


import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity 
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class employé extends personne  {
	
	//@Id
	//private int id_emp ; 
	//private String nom ; 
	//private String prenom ;
	//private String adresse ; 
	//private String mail ; 
	//private int tel ; 
	
	private String fonction ; 
	
	private float salaire ;
	
	
	@ManyToOne
    @JoinColumn(name="ref_rep" , insertable=false , updatable=false )
    private réparation réparation ;
	private Long  ref_rep ;
	
	@ManyToOne
    @JoinColumn(name="ref_vente" , insertable=false , updatable=false )
    private vente vente  ;
	private Long  ref_vente ;
	
	@ManyToOne
    @JoinColumn(name="ref_liv" , insertable=false , updatable=false )
    private livraison livraison  ;
	private Long  ref_liv ;
	
	@ManyToOne
    @JoinColumn(name="ref_loc" , insertable=false , updatable=false )
    private location location  ;
private Long  ref_loc ;

}
