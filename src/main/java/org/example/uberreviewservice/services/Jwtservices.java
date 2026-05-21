package org.example.uberreviewservice.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Service
public class Jwtservices  implements CommandLineRunner {

    @Value("${jwt.secrets}")
    private String screte;
    @Value("${jwt.timeOut}")
    private  int expiration;

    private String buildToken(Map<String, Object> claims) {
        return Jwts.builder().
                claims(claims)
                .signWith(SignatureAlgorithm.HS256, screte)
                .expiration(new Date(System.currentTimeMillis() + expiration))
                .compact();
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Hello World");
        Map<String, Object> claims = new HashMap<>();
        claims.put("name", "John Doe");
        claims.put("Roll",4);
        System.out.println(buildToken(claims));

    }
}
