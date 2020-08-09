package com.fabiogaiera.contextconfiguration.config;

import com.fabiogaiera.contextconfiguration.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigOne {

    @Bean
    public MyBean firstBean() {
        return new MyBean("Bean from AppConfigOne");
    }

}

