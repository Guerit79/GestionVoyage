package com.voyage.voyageapp.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voyage.voyageapp.bo.Region;


public interface RegionRepository extends JpaRepository<Region, Long> {
	//public Region findByIdRegion(String id_region);
}
