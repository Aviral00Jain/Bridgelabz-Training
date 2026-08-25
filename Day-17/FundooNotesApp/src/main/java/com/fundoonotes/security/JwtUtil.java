package com.fundoonotes.security;

import java.util.Date;
import java.time.Duration;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    @Value("${jwt.secret}")
    private String secret;

    private final StringRedisTemplate redisTemplate;

    public JwtUtil(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    private SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }

    public String generateToken(String userId, String email) {

        return Jwts.builder()
                .subject(userId)
                .claim("email", email)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 3600000))
                .signWith(getSigningKey())
                .compact();
    }

    public String extractUserId(String token) {

        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();
    }

    public String extractEmail(String token) {

        return Jwts.parser()
                .verifyWith(getSigningKey())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .get("email", String.class);
    }

    public boolean isTokenValid(String token) {
        String cacheKey = "jwt:valid:" + token;
        try {
            // Check Redis cache first
            String cached = redisTemplate.opsForValue().get(cacheKey);
            if ("true".equals(cached)) {
                return true;
            }

            Jwts.parser()
               	.verifyWith(getSigningKey())
               	.build()
               	.parseSignedClaims(token);

            // Cache validation result in Redis for 10 minutes
            redisTemplate.opsForValue().set(cacheKey, "true", Duration.ofMinutes(10));
            return true;

        } catch (Exception e) {
            return false;
        }
    }
}