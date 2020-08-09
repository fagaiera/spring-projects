package com.fabiogaiera.proceedingjoinpoint.annotation.main;

import com.fabiogaiera.proceedingjoinpoint.annotation.config.AppConfig;
import com.fabiogaiera.proceedingjoinpoint.annotation.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.someUserService(1, 2);
        context.close();

    }

}