package com.jee.gestion_mat_info.models;

import java.util.List;




import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;
import lombok.EqualsAndHashCode;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity 
@EqualsAndHashCode(callSuper=false)
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")


public class vente extends service {

	private String date ;
	

	@ManyToMany
	@JoinColumn(name="id", insertable=false, updatable=false)
    private List<client> clients;
	private Long  ref ;

    @ManyToMany
	@JoinColumn(name="ref_mat", insertable=false, updatable=false)
    private List<matériel> matériels;
	private Long  ref_mat;

}

