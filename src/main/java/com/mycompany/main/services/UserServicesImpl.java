package com.mycompany.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.main.entities.User;
import com.mycompany.main.repo.UserRepository;


@Service
public class UserServicesImpl implements UserServices {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User CreateUser(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		
		return userRepository.findAll();
	}

	@Override
	public User getUserByEmail(String email) {
		
		return userRepository.findByEmail(email);
	}

	@Override
	public Optional<User> getUserById(int id) {
		
		return userRepository.findById(id);
	}

	

	@Override
	public User updateUser(int id, User newuser) {
		
		User userData = userRepository.findById(id).orElse(null);
		if(userData != null) {
			return userRepository.save(newuser);
		}else {
			throw new RuntimeException("User not found");
		}
		
	}

	@Override
	public int deleteUserById(int id) {
		try {
			userRepository.deleteById(id);
			return 1;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return 0;
		}		
	}
}
