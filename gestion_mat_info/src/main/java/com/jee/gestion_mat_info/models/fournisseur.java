package com.jee.gestion_mat_info.models;

import java.util.List;




import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

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
public class fournisseur extends personne {
	
	
	//private int id_fournisseur;
   // private String adresse ; 
    //private String mail ;
    //private int tel ; 
    private String type_achat ; 
    private String site_web ;
	
    
	
	
	@ManyToMany
	//@JoinColumn(name="ref_mat", insertable=false, updatable=false)
    private List<matériel> matériels;
	private Long  ref_mat;

}
