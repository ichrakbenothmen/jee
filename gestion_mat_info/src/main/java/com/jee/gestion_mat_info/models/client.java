package com.jee.gestion_mat_info.models;




import java.util.List;





import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  //création de table
@Data //getter and setter automatique
@NoArgsConstructor 
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class client extends personne 
{
	
  

	public  String   date_naiss ; 
	public int tel ; 
	public String code_postal ;
	public  int fidelite ;
	
	/**@OneToMany //(mappedBy="client")
    private List<facture> factures; **/

	@ManyToMany
	@JoinColumn(name="ref_rep", insertable=false, updatable=false)
    public List<réparation> réparations;
	public Long  ref_rep ;

    
    
    
    @ManyToMany
	@JoinColumn(name="ref_vente", insertable=false, updatable=false)
    public List<vente> ventes;
	public Long  ref_vente;

    @ManyToMany
	@JoinColumn(name="ref_loc", insertable=false, updatable=false)
    public List<location> locations;
	public Long  ref_loc ;

    
    @ManyToMany
	@JoinColumn(name="ref_liv", insertable=false, updatable=false)
    public List<livraison> livraisons;
	public Long  ref_liv ;
	public String getDate_naiss() {
		return date_naiss;
	}
	public void setDate_naiss(String date_naiss) {
		this.date_naiss = date_naiss;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}
	public int getFidelite() {
		return fidelite;
	}
	public void setFidelite(int fidelite) {
		this.fidelite = fidelite;
	}
	public List<réparation> getRéparations() {
		return réparations;
	}
	public void setRéparations(List<réparation> réparations) {
		this.réparations = réparations;
	}
	public Long getRef_rep() {
		return ref_rep;
	}
	public void setRef_rep(Long ref_rep) {
		this.ref_rep = ref_rep;
	}
	public List<vente> getVentes() {
		return ventes;
	}
	public void setVentes(List<vente> ventes) {
		this.ventes = ventes;
	}
	public Long getRef_vente() {
		return ref_vente;
	}
	public void setRef_vente(Long ref_vente) {
		this.ref_vente = ref_vente;
	}
	public List<location> getLocations() {
		return locations;
	}
	public void setLocations(List<location> locations) {
		this.locations = locations;
	}
	public Long getRef_loc() {
		return ref_loc;
	}
	public void setRef_loc(Long ref_loc) {
		this.ref_loc = ref_loc;
	}
	public List<livraison> getLivraisons() {
		return livraisons;
	}
	public void setLivraisons(List<livraison> livraisons) {
		this.livraisons = livraisons;
	}
	public Long getRef_liv() {
		return ref_liv;
	}
	public void setRef_liv(Long ref_liv) {
		this.ref_liv = ref_liv;
	}
	@Override
	public String toString() {
		return "client [date_naiss=" + date_naiss + ", tel=" + tel + ", code_postal=" + code_postal + ", fidelite="
				+ fidelite + ", réparations=" + réparations + ", ref_rep=" + ref_rep + ", ventes=" + ventes
				+ ", ref_vente=" + ref_vente + ", locations=" + locations + ", ref_loc=" + ref_loc + ", livraisons="
				+ livraisons + ", ref_liv=" + ref_liv + "]";
	}
	

	
	
	
}