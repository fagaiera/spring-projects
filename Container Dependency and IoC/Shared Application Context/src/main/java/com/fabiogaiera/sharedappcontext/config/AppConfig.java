package com.fabiogaiera.sharedappcontext.config;

import com.fabiogaiera.sharedappcontext.service.BarService;
import com.fabiogaiera.sharedappcontext.service.BarServiceImpl;
import com.fabiogaiera.sharedappcontext.service.FooService;
import com.fabiogaiera.sharedappcontext.service.FooServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    FooService fooService() {
        return new FooServiceImpl();
    }

    @Bean
    BarService barService(FooServiceImpl fooService) {
        return new BarServiceImpl(fooService);
    }

}