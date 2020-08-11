package com.fabiogaiera.jsr250.main;

import com.fabiogaiera.jsr250.bean.HelloWorld;
import com.fabiogaiera.jsr250.configuration.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.printMessage();
        context.close();

    }

}