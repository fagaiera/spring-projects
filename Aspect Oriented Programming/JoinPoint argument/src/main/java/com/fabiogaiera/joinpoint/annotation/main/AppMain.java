package com.fabiogaiera.joinpoint.annotation.main;

import com.fabiogaiera.joinpoint.annotation.config.AppConfig;
import com.fabiogaiera.joinpoint.annotation.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.someUserService(1, 2);
        userService.anotherUserService(1, 2, 3);
        context.close();

    }

}