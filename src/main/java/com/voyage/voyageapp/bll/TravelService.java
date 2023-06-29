package com.voyage.voyageapp.bll;

import java.util.List;

import org.springframework.stereotype.Service;

import com.voyage.voyageapp.bo.Travel;

@Service
public  interface TravelService {

	public void addTravel(Travel travel);
	public void updateTravel (Travel travel);
	public void deleteTravel(int id_voyage);
    //public List<Travel> findByRegionId(String id_region);
}



/*private TravelRepository travelRepository = null;

public  TravelService(TravelRepository travelRepository) {
    this.travelRepository = travelRepository;
}

public List<Travel> getVoyagesByRegionId(String id) {
    return travelRepository.findByRegionId(id);
}*/