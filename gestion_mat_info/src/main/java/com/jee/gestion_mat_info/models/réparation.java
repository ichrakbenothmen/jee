package com.jee.gestion_mat_info.models;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity 
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class réparation extends service {

	private String date_sortie ;
	private String date_entrée ;


	@ManyToMany
	@JoinColumn(name="id", insertable=false, updatable=false)
    private List<client> clients;
	private Long  id ;

    
    @ManyToMany
	@JoinColumn(name="ref_mat", insertable=false, updatable=false)
    private List<matériel> matériels;
	private Long  ref_mat;



}