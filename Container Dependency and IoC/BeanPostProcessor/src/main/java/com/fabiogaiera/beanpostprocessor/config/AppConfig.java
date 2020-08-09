package com.fabiogaiera.beanpostprocessor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.fabiogaiera.beanpostprocessor.*")
public class AppConfig {

}