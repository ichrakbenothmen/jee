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
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class colis {
	
	  @Id
	  @GeneratedValue (strategy = GenerationType.IDENTITY)
     private  Integer  id ;
	
	
	public String date_exp ;
	public String indicateur ;
	public  float   qte_exp ; 
	

	
	@ManyToOne
	@JoinColumn(name="ref_point" , insertable=false , updatable=false )
    private distribution distribution ;
	private Long ref_point ;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDate_exp() {
		return date_exp;
	}
	public void setDate_exp(String date_exp) {
		this.date_exp = date_exp;
	}
	public String getIndicateur() {
		return indicateur;
	}
	public void setIndicateur(String indicateur) {
		this.indicateur = indicateur;
	}
	public float getQte_exp() {
		return qte_exp;
	}
	public void setQte_exp(float qte_exp) {
		this.qte_exp = qte_exp;
	}
	public distribution getDistribution() {
		return distribution;
	}
	public void setDistribution(distribution distribution) {
		this.distribution = distribution;
	}
	public Long getRef_point() {
		return ref_point;
	}
	public void setRef_point(Long ref_point) {
		this.ref_point = ref_point;
	}
	
	
	
	
	
	
	
}
