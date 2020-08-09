package com.fabiogaiera.spel.main;

import com.fabiogaiera.spel.service.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpelArithmetic spelArithmetic = context.getBean(SpelArithmetic.class);
        SpelCollection spelCollection = context.getBean(SpelCollection.class);
        SpelConditional spelConditional = context.getBean(SpelConditional.class);
        SpelLogical spelLogical = context.getBean(SpelLogical.class);
        SpelRegex spelRegex = context.getBean(SpelRegex.class);
        SpelRelational spelRelational = context.getBean(SpelRelational.class);

        System.out.println(spelArithmetic);
        System.out.println(spelCollection);
        System.out.println(spelConditional);
        System.out.println(spelLogical);
        System.out.println(spelRegex);
        System.out.println(spelRelational);

        context.close();

    }

}