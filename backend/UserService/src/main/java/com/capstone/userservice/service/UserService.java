package com.capstone.userservice.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.userservice.model.User;
import com.capstone.userservice.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    
    public User createUser(User user) {
        user.setRegistrationDate(LocalDateTime.now());
        return userRepository.save(user);
    }

    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}
