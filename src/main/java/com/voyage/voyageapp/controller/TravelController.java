package com.voyage.voyageapp.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voyage.voyageapp.bll.TravelService;
import com.voyage.voyageapp.bo.Region;
import com.voyage.voyageapp.bo.Travel;

@RestController 
@RequestMapping(value="/api/voyages")
@CrossOrigin(origins = "http://localhost:4200")
public class TravelController {

	@Autowired
	TravelService travelService;
	
	@GetMapping("findByRegionId/{idRegion}") 
	public List<Travel> findByRegionId(@PathVariable long idRegion) {
		return travelService.findByRegionId(idRegion);
	}
	
	@Autowired
	public TravelController (TravelService travelService) {
		this.travelService = travelService;
	}
	
	@GetMapping("/findAllTravels")
	public List<Travel> findAllTravels() {
		return travelService.findAllTravels();
	}
	
	@PostMapping("/addTravel")
	public Travel addTravel(@RequestBody Travel travel) {
		return travelService.addTravel(travel);
	}
	
	@PatchMapping("/updateTravel/{id_travel}")
	public Travel updateTravel(@PathVariable int id_travel,Travel travel) {
		
		travel.setId_voyage(id_travel);
		Travel updateTravel = travelService.updateTravel(travel);
		return updateTravel;
	}
	
	@DeleteMapping("deleteTravel/{id}")
	public void deleteTravel(@PathVariable int id) {
		travelService.deleteTravel(id);
	}
	
	
}
