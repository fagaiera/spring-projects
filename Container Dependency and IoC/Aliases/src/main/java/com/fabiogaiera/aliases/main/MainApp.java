package com.fabiogaiera.aliases.main;

import com.fabiogaiera.aliases.bean.SomeBean;
import com.fabiogaiera.aliases.conf.AppConf;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(AppConf.class);
        SomeBean someBean1 = configurableApplicationContext.getBean("beanOne", SomeBean.class);
        SomeBean someBean2 = configurableApplicationContext.getBean("beanTwo", SomeBean.class);
        someBean1.methodFromSomeBean();
        someBean2.methodFromSomeBean();
        configurableApplicationContext.close();

    }

}