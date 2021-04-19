package com.araketu.apijava.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.araketu.apijava.domain.User;
import com.araketu.apijava.services.UsersService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	
	@Autowired
	private UsersService service;
	
	@GetMapping
	public ResponseEntity <List<User>> findAll(){
		

		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}

}
