package com.fagun.controller;

import com.fagun.entity.User;
import com.fagun.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String showHome() {
        userRepository.save(new User());
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/admin")
    public String showAdmin() {
        return ("<h1>Welcome Admin</h1>");
    }

    @GetMapping("/user")
    public String showUser() {
        return ("<h1>Welcome User</h1>");
    }

}