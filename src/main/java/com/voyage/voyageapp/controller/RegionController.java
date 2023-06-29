package com.voyage.voyageapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.voyage.voyageapp.bll.RegionService;
import com.voyage.voyageapp.bo.Region;


@RestController 
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/api/regions")
public class RegionController {
	
	
	
	@Autowired
	RegionService regionService;
	
	@Autowired
	public RegionController(RegionService regionService) {
		this.regionService = regionService;
	}
	

	@GetMapping("/findAllRegions")
	public List<Region> findAllRegions() {
		return regionService.findAllRegions();
	}
	
	
}
