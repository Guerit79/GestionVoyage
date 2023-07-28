package com.voyage.voyageapp.bll.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import com.voyage.voyageapp.bll.UserService;
import com.voyage.voyageapp.bo.LoginForm;
import com.voyage.voyageapp.bo.Travel;
import com.voyage.voyageapp.bo.User;
import com.voyage.voyageapp.dal.UserRepository;
import com.voyage.voyageapp.dal.RoleUserRepository;
import com.voyage.voyageapp.exeption.*; 

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
	public void deleteUser(int id_utilisateur) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id_utilisateur);
	}
	
    @Override
    public User getById(int id) {
        // Appliquer les règles de logique métier si nécessaire
        return userRepository.getById(id);
    }
	
	
	@Override
	public List<User> findAllUser(){
		return userRepository.findAll();
	}
	
    public List<Travel> getVoyagesFavoris(int id) {
        User utilisateur = userRepository.findById(id);
        return utilisateur.getVoyagesFavoris();
    }
    
	/*
	@Override
	public User findUser(LoginForm loginForm) throws NotFoundException {
		
		System.out.println(loginForm.getPseudo());
		
        Optional<User existingUserByUsername = userRepository.findUserByPseudo(loginForm.getPseudo());

        System.out.println(existingUserByUsername.get());
        
        if (!existingUserByUsername.isPresent() || (!existingUserByUsername.get().getMdp().equals(loginForm.getPassword())) ) {
        	
        	throw new NotFoundException();
        	
        }
        
        return existingUserByUsername.get();
    }
	*/

	@Override
	public User authenticate(String pseudo, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
    public <Optional>User findUserByPseudo(String pseudo) {
        return userRepository.findUserByPseudo(pseudo);
    }
	
    @Override
    public boolean checkPassword(User user, String password) {
        String storedPassword = user.getMdp(); // Take mdp in BDD for user gives
        // Compare the mdp gives with the mdp in BDD
        return storedPassword.equals(password);
    }
	
	

	/*
	@Override
	public User findUser(LoginForm loginForm) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	*/

	
}
