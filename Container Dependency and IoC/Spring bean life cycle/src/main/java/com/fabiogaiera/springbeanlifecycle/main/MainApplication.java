package com.fabiogaiera.springbeanlifecycle.main;

import com.fabiogaiera.springbeanlifecycle.bean.ExampleBean;
import com.fabiogaiera.springbeanlifecycle.bean.ExampleBeanImpl;
import com.fabiogaiera.springbeanlifecycle.configuration.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ExampleBean exampleBean = (ExampleBeanImpl) context.getBean("exampleBean");
        exampleBean.printMessage();

        context.close();

    }

}