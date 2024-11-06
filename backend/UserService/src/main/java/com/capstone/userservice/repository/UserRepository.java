package com.capstone.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capstone.userservice.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	User findByUsername(String username);
    User findByEmail(String email);

}
