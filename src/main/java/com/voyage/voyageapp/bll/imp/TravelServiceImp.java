package com.voyage.voyageapp.bll.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyage.voyageapp.bo.Region;
import com.voyage.voyageapp.bo.Travel;
import com.voyage.voyageapp.bll.TravelService;
import com.voyage.voyageapp.dal.TravelRepository;

@Service
public class TravelServiceImp implements TravelService{
	
	@Autowired
	TravelRepository travelRepository;
	
	@Override
	public List<Travel> findAllTravels() {
		System.out.println("test service IMP:" + travelRepository.findAll());
		return travelRepository.findAll();
	}
	
	@Override
	public Travel addTravel(Travel travel) {
		// TODO Auto-generated method stub
		return travelRepository.save(travel);
	}

	@Override
	public Travel updateTravel(Travel travel) {
		// TODO Auto-generated method stub
		return travelRepository.save(travel);
	}

	@Override
	public void deleteTravel(int id) {
		// TODO Auto-generated method stub
		travelRepository.deleteById((int)id);
	}
	
	@Override
	public List<Travel> findByRegionId(long idRegion) {
		return travelRepository.findByRegionId(idRegion);
	}

}
