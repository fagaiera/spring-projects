package com.fabiogaiera.springbeanlifecycle.configuration;

import com.fabiogaiera.springbeanlifecycle.bean.ExampleBean;
import com.fabiogaiera.springbeanlifecycle.bean.ExampleBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public ExampleBean exampleBean() {
        return new ExampleBeanImpl();
    }

}