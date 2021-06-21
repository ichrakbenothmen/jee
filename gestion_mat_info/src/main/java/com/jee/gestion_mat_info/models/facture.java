package com.jee.gestion_mat_info.models;





import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
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

public class facture {
    
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id ;
	private float montant  ;
	private String mode_paiement ;
	private String date_paiement ;
	
	

	@ManyToOne
	@JoinColumn(name="id_clt" , insertable=false , updatable=false )
	private client client ;
	private Long id_clt;
	

	@ManyToOne
    @JoinColumn(name="id_l" , insertable=false , updatable=false )
    private réparation réparation ;
	private Long  id_l ;
	
	@ManyToOne
    @JoinColumn(name="id_v" , insertable=false , updatable=false )
    private vente vente  ;
	private Long id_v ;
	
	
	@ManyToOne
    @JoinColumn(name="id_li" , insertable=false , updatable=false )
    private livraison livraison  ;
	private Long  id_li ;
	
	
/*
	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public String getMode_paiement() {
		return mode_paiement;
	}

	public void setMode_paiement(String mode_paiement) {
		this.mode_paiement = mode_paiement;
	}

	public String getDate_paiement() {
		return date_paiement;
	}

	public void setDate_paiement(String date_paiement) {
		this.date_paiement = date_paiement;
	}

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public int getRef_service() {
		return ref_service;
	}

	public void setRef_service(int ref_service) {
		this.ref_service = ref_service;
	}
**/
}


	

	
	

