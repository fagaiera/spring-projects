package com.fabiogaiera.contextconfiguration.config;

import com.fabiogaiera.contextconfiguration.bean.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigTwo {

    @Bean
    public MyBean secondBean() {
        return new MyBean("Bean from AppConfigTwo");
    }

}
