package com.eventmanagement.www.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventmanagement.ww.repository.UserRepository;
import com.eventmanagement.www.models.User;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

  
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

   
    public User createUser(User user) {
        return userRepository.save(user);
    }

 
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }


    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
