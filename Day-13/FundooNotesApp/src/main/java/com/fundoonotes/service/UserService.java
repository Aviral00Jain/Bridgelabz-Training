package com.fundoonotes.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fundoonotes.dto.LoginRequest;
import com.fundoonotes.dto.RegisterRequest;
import com.fundoonotes.entity.User;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.security.JwtUtil;

@Service
public class UserService {

    private final UserRepository userRepository;
    
    private final JwtUtil jwtUtil;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UserService(UserRepository userRepository,JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }
    
    
    
    public String register(RegisterRequest request) {

        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Email already registered");
        }

        User user = new User();

        user.setEmail(request.getEmail());
        user.setPasswordHash(passwordEncoder.encode(request.getPassword()));
        user.setName(request.getName());

        User savedUser = userRepository.save(user);

        return jwtUtil.generateToken(String.valueOf(savedUser.getUserId()),savedUser.getEmail());
    }
        
        
        
        public String login(LoginRequest request) {

            User user = userRepository.findByEmail(request.getEmail())
                    		.orElseThrow(() ->new IllegalArgumentException("Invalid email or password"));

            if (!passwordEncoder.matches(request.getPassword(),user.getPasswordHash())) {
                throw new IllegalArgumentException("Invalid email or password");
            }

            return jwtUtil.generateToken(String.valueOf(user.getUserId()),user.getEmail());
        }
        
}