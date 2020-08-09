package com.fabiogaiera.junitspring.config;

import com.fabiogaiera.junitspring.service.SampleService;
import com.fabiogaiera.junitspring.service.SampleServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SampleService getSampleService() {
        return new SampleServiceImpl();
    }

}