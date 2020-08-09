package com.fabiogaiera.callback.main;

import com.fabiogaiera.callback.config.AppConfig;
import com.fabiogaiera.callback.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.performRowCallbackHandler();
        userService.performPreparedStatementCreator();
        userService.performCallableStatementCreator();
        context.close();

    }

}