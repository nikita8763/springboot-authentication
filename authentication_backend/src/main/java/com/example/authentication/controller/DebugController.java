package com.example.authentication.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DebugController {

    private final PasswordEncoder passwordEncoder;

    public DebugController(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/test-password")
    public String testPassword(@RequestParam String rawPassword, @RequestParam String storedHash) {
        boolean matches = passwordEncoder.matches(rawPassword, storedHash);
        return matches ? "Password matches!" : "Password does not match!";
    }
}
