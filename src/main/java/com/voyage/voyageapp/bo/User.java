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
@Table(name = "utilisateur")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_utilisateur", nullable= false)
    private int id_utilisateur;
    
    @ManyToOne
    @JoinColumn(name = "id_role_utilisateur", referencedColumnName = "id_role_utilisateur")
    private RoleUser id_role_utilisateur;
    
    @Column(name="pseudo")
    private String pseudo;
    
    @Column(name="mail")
    private String mail;
    
    @Column(name="mdp")
    private String mdp;
    
    
    
    // CONSTRUCTEUR
    
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int id_utilisateur, RoleUser id_role_utilisateur, String pseudo, String mail, String mdp) {
		super();
		this.id_utilisateur = id_utilisateur;
		this.id_role_utilisateur = id_role_utilisateur;
		this.pseudo = pseudo;
		this.mail = mail;
		this.mdp = mdp;
	}



	// GETTER ET SETTER 
	
	public int getId_utilisateur() {
		return id_utilisateur;
	}

	public void setId_utilisateur(int id_utilisateur) {
		this.id_utilisateur = id_utilisateur;
	}

	public RoleUser getId_role_utilisateur() {
		return id_role_utilisateur;
	}

	public void setId_role_utilisateur(RoleUser id_role_utilisateur) {
		this.id_role_utilisateur = id_role_utilisateur;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
}
