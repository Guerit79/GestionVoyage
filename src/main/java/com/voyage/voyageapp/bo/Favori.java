package com.voyage.voyageapp.bo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "favori")
public class Favori {
    
    @Id
	@ManyToOne
	@JoinColumn(name = "id_utilisateur", referencedColumnName = "id_utilisateur")
    private User user;
	//, insertable=false, updatable=false
    @Id
    @ManyToOne
    @JoinColumn(name = "id_voyage", referencedColumnName = "id_voyage")
    private Travel travel;



	// GETTER ET SETTER     
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}
	
}
