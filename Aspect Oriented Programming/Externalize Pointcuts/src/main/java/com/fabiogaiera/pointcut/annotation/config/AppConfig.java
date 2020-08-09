package com.fabiogaiera.pointcut.annotation.config;

import com.fabiogaiera.pointcut.annotation.aspect.UserAspect;
import com.fabiogaiera.pointcut.annotation.service.UserService;
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
