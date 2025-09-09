package com.mycompany.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;

import com.mycompany.main.entities.User;

public interface UserServices {
	public User CreateUser(User user);
		
	public User getUserByEmail(String email);
	
	public Optional<User> getUserById(int id);
	
	public User updateUser(int id,User user);
	
	public int deleteUserById(int id);

	List<User> getAllUsers(Pageable pageable,String search);
}
