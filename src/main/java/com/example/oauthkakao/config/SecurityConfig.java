package com.example.oauthkakao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

@Bean
public SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {

    http.oauth2Login(login -> login
                                .loginPage("/login")
                                
                );

    return http.build();
}

}
