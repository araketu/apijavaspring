package com.araketu.apijava.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.araketu.apijava.domain.User;
import com.araketu.apijava.repository.UserRepository;

@Service
public class UsersService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
		
	
	}

}
