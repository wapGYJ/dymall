package com.wapgyj.authservice.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;


@Component
public class JwtUtil {

   private static SecretKey secretKey ;

   private static long expirationMs;

    // 通过构造函数注入配置值
    public JwtUtil(
            @Value("${jwt.secret-key}") String secretKey,
            @Value("${jwt.expiration-ms}") long expirationMs) {

        // 将字符串转换为安全密钥
        JwtUtil.secretKey = Keys.hmacShaKeyFor(secretKey.getBytes(StandardCharsets.UTF_8));
        JwtUtil.expirationMs = expirationMs;
    }


    //生成token
    public static String generateToken(int userId) {
        return Jwts.builder()
                .setSubject(String.valueOf(userId))
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expirationMs))
                .signWith(secretKey)
                .compact();
    }

    public static boolean validateToken(String token) {
        try {
            Jwts.parserBuilder()
                    .setSigningKey(secretKey)
                    .build()
                    .parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // 获取用户ID
    public static int getUserIdFromToken(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(token)
                .getBody();
        return Integer.parseInt(claims.getSubject());
    }

    public SecretKey getSecretKey() {
        return secretKey;
    }

    public long getExpirationMs() {
        return expirationMs;
    }
}