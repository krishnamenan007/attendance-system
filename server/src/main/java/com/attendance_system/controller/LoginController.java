package com.attendance_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.attendance_system.model.LoginRequest;
import com.attendance_system.model.LoginResponse;
import com.attendance_system.service.AuthService;


@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")  // Allows any origin for API testing purpose


public class LoginController {
    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        String token = authService.authenticateUser(loginRequest.getUsername(), loginRequest.getPassword());
        return ResponseEntity.ok(new LoginResponse(token));
    }
    @GetMapping("/check")
    public String checkController() {
        return "Controller is working!";
    }
   
}