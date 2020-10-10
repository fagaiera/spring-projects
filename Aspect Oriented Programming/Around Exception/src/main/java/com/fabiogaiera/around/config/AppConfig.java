package com.fabiogaiera.around.config;

import com.fabiogaiera.around.service.UserService;
import com.fabiogaiera.around.aspect.UserAspect;
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