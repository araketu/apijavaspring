package com.araketu.apijava.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.araketu.apijava.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	
	@GetMapping
	public ResponseEntity <List<User>> findAll(){
		
		User diogo = new User("1", "Diogo Ghizoni", "diogo.almeida@iesb.edu.br");
		User alex = new User("2", "Alex Ribamar", "alex.ribamar@iesb.edu.br");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(diogo,alex));
		return ResponseEntity.ok().body(list);
		
	}

}
