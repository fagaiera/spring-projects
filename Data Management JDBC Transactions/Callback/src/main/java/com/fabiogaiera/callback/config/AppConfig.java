package com.fabiogaiera.callback.config;

import com.fabiogaiera.callback.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    public DataSource dataSourceWorldDB() {

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;

    }

    @Bean
    public DataSource dataSourceSakilaDB() {

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/sakila?useSSL=false&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;

    }

    @Bean
    public JdbcTemplate jdbcTemplateWorldDb() {
        return new JdbcTemplate(dataSourceWorldDB());
    }

    @Bean
    public JdbcTemplate jdbcTemplateSakilaDb() {
        return new JdbcTemplate(dataSourceSakilaDB());
    }

    @Bean
    public UserService userService() {
        return new UserService();
    }

}