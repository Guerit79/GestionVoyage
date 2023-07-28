package com.voyage.voyageapp.bll;

import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.voyage.voyageapp.bo.LoginForm;
import com.voyage.voyageapp.bo.Travel;
import com.voyage.voyageapp.bo.User;

public interface UserService {
	public void addUser(User user);
	public void updateUser (User user);
	public void deleteUser(int id);
	//public User findUser(LoginForm loginForm) throws NotFoundException;
	public List<User> findAllUser();
	public class AuthService {} 
	
	public User authenticate(String pseudo, String password);
	
	public <Optional>User findUserByPseudo(String pseudo);

	public boolean checkPassword(User user, String password);
	
	public List<Travel> getVoyagesFavoris(int id);
	
	public User getById(int id);
}
