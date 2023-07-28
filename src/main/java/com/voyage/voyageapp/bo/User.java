package com.voyage.voyageapp.bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;



@Entity
@Table(name = "utilisateur")
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_utilisateur", nullable= false)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "id_role_utilisateur", referencedColumnName = "id_role_utilisateur")
    private RoleUser id_role_utilisateur;
    
    @Column(name="pseudo")
    private String pseudo;
    
    @Column(name="mail")
    private String mail;
    
    @Column(name="mdp")
    private String mdp;
    
    
    @ManyToMany
    @JoinTable(name = "favori",
            joinColumns = @JoinColumn(name = "id_utilisateur"),
            inverseJoinColumns = @JoinColumn(name = "id_voyage"))
    private List<Travel> voyagesFavoris;
    
    
    // CONSTRUCTEUR
    
	public User() {

	}
	
	public User(int id_utilisateur, RoleUser id_role_utilisateur, String pseudo, String mail, String mdp) {
		super();
		this.id = id;
		this.id_role_utilisateur = id_role_utilisateur;
		this.pseudo = pseudo;
		this.mail = mail;
		this.mdp = mdp;
	}

    public List<Travel> getVoyagesFavoris() {
        return voyagesFavoris;
    }

	// GETTER ET SETTER 
	
	public int getId_utilisateur() {
		return id;
	}

	public void setId_utilisateur(int id) {
		this.id = id;
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
