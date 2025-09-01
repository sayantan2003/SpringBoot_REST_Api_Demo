package com.mycompany.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.main.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	public User findByEmail(String email);
	
	
}
