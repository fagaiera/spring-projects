package com.fabiogaiera.contextconfiguration.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.fabiogaiera.contextconfiguration.service")
public class AppConfig {

}