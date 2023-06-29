package com.voyage.voyageapp.bll;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.voyage.voyageapp.bo.Region;
import com.voyage.voyageapp.bo.Travel;

@Service
public  interface TravelService {

	public Travel addTravel(Travel travel);
	public Travel updateTravel (Travel travel);
	public void deleteTravel(int id_voyage);
	public List<Travel> findAllTravels();
    public List<Travel> findByRegionId(long idRegion);
}



/*private TravelRepository travelRepository = null;

public  TravelService(TravelRepository travelRepository) {
    this.travelRepository = travelRepository;
}

public List<Travel> getVoyagesByRegionId(String id) {
    return travelRepository.findByRegionId(id);
}*/