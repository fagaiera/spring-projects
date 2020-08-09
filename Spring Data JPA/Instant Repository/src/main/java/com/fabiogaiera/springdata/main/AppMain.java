package com.fabiogaiera.springdata.main;

import com.fabiogaiera.springdata.config.AppConfig;
import com.fabiogaiera.springdata.service.CityService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CityService cityService = context.getBean(CityService.class);
        System.out.println(cityService.findAll1());
        System.out.println(cityService.findAll2());
        context.close();

    }

}