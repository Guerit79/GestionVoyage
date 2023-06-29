package com.voyage.voyageapp.bll.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyage.voyageapp.bll.RegionService;
import com.voyage.voyageapp.bo.Region;
import com.voyage.voyageapp.dal.RegionRepository;

@Service
public class RegionServiceImp implements RegionService {

	
	@Autowired
	RegionRepository regionRepository;

	@Override
	public List<Region> findAllRegions() {
		System.out.println("test service IMP:" + regionRepository.findAll());
		return regionRepository.findAll();
	}
}
