package com.voyage.voyageapp.dal;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.voyage.voyageapp.bo.Travel;

@Repository
public interface TravelRepository extends JpaRepository<Travel, Integer> {
	
	
	@Query(nativeQuery = true,
			value = "SELECT * FROM voyage v WHERE " +
                    "v.id_region = (:idRegion)")
    List<Travel> findByRegionId(@Param("idRegion") Long idRegion);
	
}
