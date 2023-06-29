package com.voyage.voyageapp.bo;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_region", nullable= false)
    private int id_region;
    
    @Column(name="nom")
    private String nom;
    
    /*
    @JsonIgnore
    @OneToMany(mappedBy = "id_region", cascade = CascadeType.ALL)
    private List<Travel> travel;
    */
    
    
    // CONSTRUCTEUR
    
    
    public Region() {
    	super();
    }
   
    
    /*
	public Region(int id_region, String nom, List<Travel> travel) {
		this.id_region = id_region;
		this.nom = nom;
		this.travel = travel;
	}
	*/
	
	
	// GETTER ET SETTER 

	public int getId_region() {
		return id_region;
	}

	public void setId_region(int id_region) {
		this.id_region = id_region;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	/*
	public List<Travel> getTravel() {
		return travel;
	}
	*/
}
