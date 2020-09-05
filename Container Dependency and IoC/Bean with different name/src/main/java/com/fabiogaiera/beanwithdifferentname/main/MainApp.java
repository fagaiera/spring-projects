package com.fabiogaiera.beanwithdifferentname.main;

import com.fabiogaiera.beanwithdifferentname.bean.SomeBean;
import com.fabiogaiera.beanwithdifferentname.conf.AppConf;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(AppConf.class);
        SomeBean someBean = configurableApplicationContext.getBean("someBeanWithAnotherName", SomeBean.class);
        someBean.methodFromSomeBean();
        configurableApplicationContext.registerShutdownHook();

    }

}