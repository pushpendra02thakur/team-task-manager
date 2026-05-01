package com.taskmanager.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping("/signup")
    public void signup() {
        // signup logic
    }

    @PostMapping("/login")
    public void login() {
        // login logic
    }
}