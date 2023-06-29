package com.voyage.voyageapp.dal;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voyage.voyageapp.bo.Travel;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Long> {
	//List<Travel> findByRegionId(String id_region);
}
