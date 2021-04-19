package com.araketu.apijava.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.araketu.apijava.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
