package com.attendance_system.service;
import org.springframework.stereotype.Service;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class AuthService {
    private static final Key JWT_SECRET = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    private final Map<String, String> userCredentials;

    public AuthService() {
        // Temporary user credentials for development purposes)
        userCredentials = new HashMap<>();
        userCredentials.put("user", "password123");
        userCredentials.put("admin", "1234"); 
    }

    public String authenticateUser(String username, String password) {
        // Check if user exists and password matches
        if (userCredentials.containsKey(username) && 
            userCredentials.get(username).equals(password)) {
            
            return generateToken(username);
        }
        throw new RuntimeException("Invalid username or password");
    }

    private String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 864000000)) // 10 days
                .signWith(SignatureAlgorithm.HS256, JWT_SECRET.getEncoded())
                .compact();
    }
}