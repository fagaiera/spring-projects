package com.fabiogaiera.qualifier.main;

import com.fabiogaiera.qualifier.config.AppConfig;
import com.fabiogaiera.qualifier.service.AnimalService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalService animalService = context.getBean(AnimalService.class);
        animalService.getAnimal().printName();
        animalService.getZoo().getZooName();
        context.close();

    }

}