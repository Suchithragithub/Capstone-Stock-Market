package com.capstone.userservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.userservice.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByUsername(String username);
    User findByEmail(String email);

}
