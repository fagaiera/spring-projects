package com.fabiogaiera.aliases.conf;

import com.fabiogaiera.aliases.bean.SomeBean;
import com.fabiogaiera.aliases.bean.SomeBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf {

    @Bean(name = {"beanOne", "beanTwo"})
    public SomeBean someBean() {
        return new SomeBeanImpl();
    }

}