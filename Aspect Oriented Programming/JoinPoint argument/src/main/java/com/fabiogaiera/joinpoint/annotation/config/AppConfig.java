package com.fabiogaiera.joinpoint.annotation.config;

import com.fabiogaiera.joinpoint.annotation.aspect.UserAspect;
import com.fabiogaiera.joinpoint.annotation.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    public UserAspect userAspect() {
        return new UserAspect();
    }

}