package com.fabiogaiera.plainsql.main;

import com.fabiogaiera.plainsql.config.AppConfig;
import com.fabiogaiera.plainsql.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.performStatementCallback();
        context.close();

    }

}