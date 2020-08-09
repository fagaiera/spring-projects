package com.fabiogaiera.transactional.main;

import com.fabiogaiera.transactional.config.AppConfig;
import com.fabiogaiera.transactional.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.performSQLQueries();
        context.close();

    }

}