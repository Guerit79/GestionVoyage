package com.voyage.voyageapp.bll.imp;

import org.springframework.beans.factory.annotation.Autowired;

import com.voyage.voyageapp.bll.RoleUserService;
import com.voyage.voyageapp.dal.RoleUserRepository;

public class RoleUserServiceImp implements RoleUserService{

	@Autowired
	RoleUserRepository roleUserRepository;
}
