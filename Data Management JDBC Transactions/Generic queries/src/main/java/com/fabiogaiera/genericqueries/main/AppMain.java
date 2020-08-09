package com.fabiogaiera.genericqueries.main;

import com.fabiogaiera.genericqueries.config.AppConfig;
import com.fabiogaiera.genericqueries.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.performQuery();
        userService.performQueryForObject();
        userService.performQueryForList();
        userService.performQueryForMap();
        context.close();

    }

}