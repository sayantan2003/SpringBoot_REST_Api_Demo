package com.mycompany.main.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.main.entities.User;
import com.mycompany.main.services.UserServices;

@RestController
@RequestMapping("/user")
public class MyController {
	
	@Autowired
	private UserServices userService;
	
	
	@PostMapping("/add")
	public User addUserDetails(@RequestBody User user) {
		
		System.out.println("controller : "+user);
		return userService.CreateUser(user);
	}
	
	@GetMapping("/list")
	public List<User> getAllUserDetails(
			@RequestParam (required = false, defaultValue = "1") int pageNo,
			@RequestParam (required = false, defaultValue = "4") int pageSize,
			@RequestParam (required = false, defaultValue = "id") String sortBy ,
			@RequestParam (required = false, defaultValue = "Asc") String sortDir,
			@RequestParam (required = false) String search) {
		
		//select *from user limit pageSize offset (pageNo -1)*pageSize 
		Sort sort = null;
		
		if(sortDir.equalsIgnoreCase("ASC")) {
			sort = Sort.by(sortBy).ascending();
		}
		else {
			sort = Sort.by(sortBy).descending();
		}
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return userService.getAllUsers(pageable,search);
	}
	
	@GetMapping("/email/{email}")
	public User getUserDetailsByEmail(@PathVariable String email) {
		
		return userService.getUserByEmail(email);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getUserDetailsById(@PathVariable int id) {
		
	    System.out.println("Fetching user with ID: " + id);
	    try {
	        Optional<User> userOpt = userService.getUserById(id);
	        if (userOpt.isPresent()) {
	            return ResponseEntity.ok(userOpt.get());
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	        }
	    } catch (Exception e) {
	        System.out.println("Error fetching user: " + e.getMessage());
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Server error");
	    }
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<User> updateUserDetails(@PathVariable int id,@RequestBody User user) {
		User updatedUser = userService.updateUser(id, user);
		if(updatedUser != null) {
			return ResponseEntity.ok(updatedUser);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?>deleteUserDetailsById(@PathVariable int id){
		int status = userService.deleteUserById(id);
		if(status == 1) {
			return ResponseEntity.ok("User Deleted Successfully");
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Have some issue");
		}
	}
	
}
