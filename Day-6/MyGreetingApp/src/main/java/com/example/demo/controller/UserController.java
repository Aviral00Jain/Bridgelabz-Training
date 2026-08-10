package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // =========================
    // THYMELEAF - REGISTRATION
    // =========================

    @GetMapping("/register")
    public String showRegisterPage(Model model) {

        model.addAttribute("user", new User());

        return "register";
    }

    @PostMapping("/register")
    public String registerUser(User user) {

        userService.saveUser(user);

        return "redirect:/login";
    }

    // =========================
    // THYMELEAF - LOGIN
    // =========================

    @GetMapping("/login")
    public String showLoginPage() {

        return "login";
    }

    @PostMapping("/login")
    public String loginUser(
            @RequestParam String email,
            @RequestParam String password,
            Model model) {

        User user = userService.login(email, password);

        if (user != null) {

            model.addAttribute("name", user.getName());

            return "greeting";
        }

        model.addAttribute("error", "Invalid email or password");

        return "login";
    }

    // =========================
    // JSP - READ ALL USERS
    // =========================

    @GetMapping("/users")
    public String getAllUsers(Model model) {

        model.addAttribute("users", userService.getAllUsers());

        return "users";
    }

    // =========================
    // JSP - SHOW EDIT PAGE
    // =========================

    @GetMapping("/users/edit/{id}")
    public String showEditPage(
            @PathVariable Long id,
            Model model) {

        User user = userService.getUserById(id);

        model.addAttribute("user", user);

        return "edit-user";
    }

    // =========================
    // JSP - UPDATE USER
    // =========================

    @PostMapping("/users/update")
    public String updateUser(User user) {

        userService.updateUser(user);

        return "redirect:/users";
    }

    // =========================
    // JSP - DELETE USER
    // =========================

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable Long id) {

        userService.deleteUser(id);

        return "redirect:/users";
    }
}