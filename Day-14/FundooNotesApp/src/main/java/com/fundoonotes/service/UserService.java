package com.fundoonotes.service;

import com.fundoonotes.dto.request.LoginRequest;
import com.fundoonotes.dto.request.RegisterRequest;

public interface UserService {

    String register(RegisterRequest request);

    String login(LoginRequest request);

    String forgotPassword(String email);

    void resetPassword(String token, String newPassword);
}