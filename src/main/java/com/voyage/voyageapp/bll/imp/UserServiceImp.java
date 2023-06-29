package com.voyage.voyageapp.bll.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voyage.voyageapp.bll.UserService;
import com.voyage.voyageapp.bo.User;
import com.voyage.voyageapp.dal.UserRepository;
import com.voyage.voyageapp.dal.RoleUserRepository;


@Service
public class UserServiceImp implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleUserRepository roleUserRepository;
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
	
	@Override
	public List<User> findAllUser(){
		return userRepository.findAll();
	}

	
}
