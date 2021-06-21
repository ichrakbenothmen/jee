package com.jee.gestion_mat_info.models;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

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

public class matériel {

	@Id
	  @GeneratedValue (strategy = GenerationType.IDENTITY)

	private int ref_mat ;
	private String type_mat ;
	private String marque ;
	private float prix ;
	private float stock ;
	private String mat_description ;
	

	@ManyToMany
	@JoinColumn(name="id", insertable=false, updatable=false)
    private List<fournisseur> fournisseurs;
	private Long id ;

	
     

	@ManyToMany
	@JoinColumn(name="ref_com", insertable=false, updatable=false)
    private List<commande> commandes;
	private Long  ref_com;

	
    @ManyToMany
	@JoinColumn(name="ref_rep", insertable=false, updatable=false)
    private List<réparation> réparations;
	private Long  ref_rep ;

    @ManyToMany
	//@JoinColumn(name="ref_vente", insertable=false, updatable=false)
    private List<vente> ventes;
	private Long  ref_vente;

    @ManyToMany
	@JoinColumn(name="ref_loc", insertable=false, updatable=false)
    private List<location> locations;
	private Long  ref_loc ;

    @ManyToMany
	@JoinColumn(name="ref_liv", insertable=false, updatable=false)
    private List<livraison> livraisons;
	private Long  ref_liv ;

}
	
	
		