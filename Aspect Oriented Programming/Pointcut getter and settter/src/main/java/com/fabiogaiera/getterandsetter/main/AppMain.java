package com.fabiogaiera.getterandsetter.main;

import com.fabiogaiera.getterandsetter.config.AppConfig;
import com.fabiogaiera.getterandsetter.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.setName("Fabio");
        userService.getName();
        context.close();

    }

}
