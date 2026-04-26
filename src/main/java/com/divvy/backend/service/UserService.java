package com.divvy.backend.service;

import com.divvy.backend.model.User;
import com.divvy.backend.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){

        if(userRepository.existsByContactNumber(user.getContactNumber())){
            throw new RuntimeException("User already exist");

        }

        return userRepository.save(user);

    }
}
