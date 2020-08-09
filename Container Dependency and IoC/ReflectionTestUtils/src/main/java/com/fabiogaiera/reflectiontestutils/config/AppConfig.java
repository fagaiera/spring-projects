package com.fabiogaiera.reflectiontestutils.config;

import com.fabiogaiera.reflectiontestutils.service.PersonService;
import com.fabiogaiera.reflectiontestutils.service.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PersonService getPerson() {
        return new PersonServiceImpl();
    }

}