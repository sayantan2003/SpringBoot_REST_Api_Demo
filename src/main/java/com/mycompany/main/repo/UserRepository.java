package com.mycompany.main.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.main.entities.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	public User findByEmail(String email);
	
	public Page<User>findByName(String name,Pageable pageable);
	
	
}
