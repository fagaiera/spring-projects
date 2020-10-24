package com.fabiogaiera.programmatictransaction.main;

import com.fabiogaiera.programmatictransaction.config.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.close();

    }

}