package com.voyage.voyageapp.bll.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyage.voyageapp.bo.Travel;
import com.voyage.voyageapp.bll.TravelService;
import com.voyage.voyageapp.dal.TravelRepository;

@Service
public class TravelServiceImp implements TravelService{
	
	@Autowired
	TravelRepository travelrepository;
	
	@Override
	public void addTravel(Travel travel) {
		// TODO Auto-generated method stub
		travelrepository.save(travel);
	}

	@Override
	public void updateTravel(Travel travel) {
		// TODO Auto-generated method stub
		travelrepository.save(travel);
	}

	@Override
	public void deleteTravel(int id) {
		// TODO Auto-generated method stub
		travelrepository.deleteById((long)id);
	}

	/*
	@Override
	public List<Travel> findByRegionId(String id_region) {
		// TODO Auto-generated method stub
		return travelrepository.findByRegionId(id_region);
	}
*/
}
