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
@Table(name = "role_utilisateur")
public class RoleUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_role_utilisateur", nullable= false)
    private int id_role_utilisateur;
    
    @Column(name="nom_role")
    private String nomRole;
    
    @JsonIgnore
    @OneToMany(mappedBy = "id_role_utilisateur", cascade = CascadeType.ALL)
    private List<User> user;
    
    
    
    // CONSTRUCTEUR
    
	public RoleUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public RoleUser(int id_role_utilisateur, String nomRole, List<User> user) {
		super();
		this.id_role_utilisateur = id_role_utilisateur;
		this.nomRole = nomRole;
		this.user = user;
	}



	// GETTER ET SETTER 
	

	public int getId_role_utilisateur() {
		return id_role_utilisateur;
	}

	public void setId_role_utilisateur(int id_role_utilisateur) {
		this.id_role_utilisateur = id_role_utilisateur;
	}

	public String getNomRole() {
		return nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}
	
	
	
}
