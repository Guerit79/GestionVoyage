package com.voyage.voyageapp.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.voyage.voyageapp.bo.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
