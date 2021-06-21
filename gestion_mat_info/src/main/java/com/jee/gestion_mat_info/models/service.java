package com.jee.gestion_mat_info.models;

import java.util.List;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GenerationType;




@MappedSuperclass
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class service {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id ;
	public String nom_service ;
	
	
	

	@ManyToMany
	//@JoinColumn(name="id_client", insertable=false, updatable=false)
    private List<client> clients;
	
	
	
	@ManyToMany
	//@JoinColumn(name="ref_mat", insertable=false, updatable=false)
    private List<matériel> matériels;
	

	
	
	
	/**
	public service() {
		super();
	}
	public service(int ref_service, String nom_service) {
		super();
		this.ref_service = ref_service;
		this.nom_service = nom_service;
	}
	public int getRef_service() {
		return ref_service;
	}
	public void setRef_service(int ref_service) {
		this.ref_service = ref_service;
	}
	public String getNom_service() {
		return nom_service;
	}
	public void setNom_service(String nom_service) {
		this.nom_service = nom_service;
	}
	@Override
	public String toString() {
		return "service [ref_service=" + ref_service + ", nom_service=" + nom_service + "]";
	}
	
	
	*/
	
	
}
