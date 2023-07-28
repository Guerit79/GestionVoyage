package com.voyage.voyageapp.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.Set;
import java.util.HashSet;
import java.util.List;



@Entity
@Table(name = "voyage")
public class Travel {
	
	//compteur_like
	
    @Id
    @Column(name="id_voyage", nullable= false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_voyage;
    
    @ManyToOne
    @JoinColumn(name = "id_region", referencedColumnName = "id_region")
    private Region id_region;
	
    @Column(name="titre")
    private String titre;
    
    @Column(name="description")
    private String description;
    
    @Column(name="compteur_like")
    private int compteurLike;
    
    @ManyToMany(mappedBy = "voyagesFavoris")
    private List<User> utilisateurs;
	


    
    
    // CONSTRUCTEUR 
    
    public Travel() {
    }
    

	
	// GETTER ET SETTERS
	
	public long getId_voyage() {
		return id_voyage;
	}

	public void setId_voyage(long id_voyage) {
		this.id_voyage = id_voyage;
	}

	public Region getId_region() {
		return id_region;
	}

	public void setId_region(Region id_region) {
		this.id_region = id_region;
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

	public int getCompteurLike() {
		return compteurLike;
	}

	public void setCompteurLike(int compteurLike) {
		this.compteurLike = compteurLike;
	}
	
}
