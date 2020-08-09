package com.fabiogaiera.javabased.config;

import com.fabiogaiera.javabased.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }

}