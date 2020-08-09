package com.fabiogaiera.scalar.main;

import com.fabiogaiera.scalar.config.AppConfig;
import com.fabiogaiera.scalar.service.BookService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BookService bookService = context.getBean(BookService.class);
        bookService.printBook();
        context.close();

    }

}