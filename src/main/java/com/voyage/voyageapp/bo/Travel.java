package com.voyage.voyageapp.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "voyage")
public class Travel {
	
	//compteur_like
	
    @Id
    @Column(name="id_voyage", nullable= false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_voyage;
    
    @ManyToOne
    //@JoinColumn(name = "id_region")
    @JoinColumn(name = "id_region", referencedColumnName = "id_region")
    private Region id_region;
	
    @Column(name="titre")
    private String titre;
    
    @Column(name="description")
    private String description;
    
    @Column(name="compteur_like")
    private int compteurLike;
    
    
    
    // CONSTRUCTEUR 
    
    public Travel() {
    }

	
	// GETTER ET SETTERS

	
	
	public int getId() {
		return id_voyage;
	}
	
	public int getId_voyage() {
		return id_voyage;
	}

	public void setId_voyage(int id_voyage) {
		this.id_voyage = id_voyage;
	}

	public Region  getRegion() {
		return id_region;
	}

	public void setRegion(Region  id_region) {
		this.id_region = id_region;
	}

	public int getCompteurLike() {
		return compteurLike;
	}

	public void setCompteurLike(int compteurLike) {
		this.compteurLike = compteurLike;
	}

	public void setId(int id_voyage) {
		this.id_voyage = id_voyage;
	}

	public String getTitre() {
		return titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
