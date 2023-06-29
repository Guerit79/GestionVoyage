package com.voyage.voyageapp.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voyage.voyageapp.bo.RoleUser;

public interface RoleUserRepository extends JpaRepository<RoleUser, Long>{

	//public RoleUser findRole(String nom_role);
}
