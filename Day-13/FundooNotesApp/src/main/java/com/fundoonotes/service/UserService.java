package com.fundoonotes.service;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fundoonotes.dto.LoginRequest;
import com.fundoonotes.dto.RegisterRequest;
import com.fundoonotes.entity.PasswordResetToken;
import com.fundoonotes.entity.User;
import com.fundoonotes.repository.PasswordResetTokenRepository;
import com.fundoonotes.repository.UserRepository;
import com.fundoonotes.security.JwtUtil;

@Service
public class UserService {

    private final UserRepository userRepository;
    
    private final JwtUtil jwtUtil;
    
    private final PasswordResetTokenRepository passwordResetTokenRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UserService(UserRepository userRepository,JwtUtil jwtUtil,PasswordResetTokenRepository passwordResetTokenRepository) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
        this.passwordResetTokenRepository = passwordResetTokenRepository;
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
        
        
        
        public String forgotPassword(String email) {

            User user = userRepository.findByEmail(email)
                    .orElseThrow(() -> new IllegalArgumentException("User not found"));

            String token = UUID.randomUUID().toString();

            PasswordResetToken resetToken = new PasswordResetToken();

            resetToken.setToken(token);
            resetToken.setUser(user);
            resetToken.setExpiryTime(LocalDateTime.now().plusMinutes(15));
            resetToken.setUsed(false);

            passwordResetTokenRepository.save(resetToken);

            return token;
        }
        
        
        
        public void resetPassword(String token, String newPassword) {

            PasswordResetToken resetToken = passwordResetTokenRepository.findByToken(token)
                            .orElseThrow(() -> new IllegalArgumentException("Invalid recovery token"));

            if (resetToken.isUsed()) throw new IllegalArgumentException("Recovery token has already been used");

            if (resetToken.getExpiryTime().isBefore(LocalDateTime.now())) {
                throw new IllegalArgumentException("Recovery token has expired");
            }

            User user = resetToken.getUser();

            user.setPasswordHash(passwordEncoder.encode(newPassword));

            userRepository.save(user);

            resetToken.setUsed(true);

            passwordResetTokenRepository.save(resetToken);
        }
        
}