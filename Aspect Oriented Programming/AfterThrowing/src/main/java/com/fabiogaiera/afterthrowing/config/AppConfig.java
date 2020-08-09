package com.fabiogaiera.afterthrowing.config;

import com.fabiogaiera.afterthrowing.aspect.UserAspect;
import com.fabiogaiera.afterthrowing.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public UserService userService(){
        return new UserService();
    }

    @Bean
    public UserAspect userAspect(){
        return new UserAspect();
    }

}
