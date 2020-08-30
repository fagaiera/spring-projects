package com.fabiogaiera.contextconfiguration.main;

import com.fabiogaiera.contextconfiguration.config.AppConfig;
import com.fabiogaiera.contextconfiguration.service.Service2;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Service2 service2 = ctx.getBean(Service2.class);
        System.out.println(service2.methodFromService2());
        ctx.close();

    }

}