package com.voyage.voyageapp.bll;

import java.util.List;

import com.voyage.voyageapp.bo.User;

public interface UserService {
	public void addUser(User user);
	public void updateUser (User user);
	public void deleteUser(Long id);
	public List<User> findAllUser();
}
