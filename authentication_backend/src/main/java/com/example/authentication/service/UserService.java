package com.example.authentication.service;

import com.example.authentication.model.UserEntity;
import com.example.authentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void registerUser(String username, String rawPassword, String role) {
        String encodedPassword = passwordEncoder.encode(rawPassword);
        UserEntity user = new UserEntity(username, encodedPassword, role);
        userRepository.save(user); // Save encoded password
    }
}
