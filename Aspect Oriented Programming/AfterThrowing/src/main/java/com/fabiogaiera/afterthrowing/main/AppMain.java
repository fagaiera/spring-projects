package com.fabiogaiera.afterthrowing.main;

import com.fabiogaiera.afterthrowing.config.AppConfig;
import com.fabiogaiera.afterthrowing.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.someUserService();
        context.close();

    }

}
