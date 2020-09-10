package com.fabiogaiera.callback.config;

import com.fabiogaiera.callback.service.ResultSetExtractorBean;
import com.fabiogaiera.callback.service.RowCallbackHandlerBean;
import com.fabiogaiera.callback.service.RowMapperBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT&allowPublicKeyRetrieval=true");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;

    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public RowCallbackHandlerBean rowCallbackHandlerBean() {
        return new RowCallbackHandlerBean();
    }

    @Bean
    public ResultSetExtractorBean resultSetExtractorBean() {
        return new ResultSetExtractorBean();
    }

    @Bean
    public RowMapperBean rowMapperBean() {
        return new RowMapperBean();
    }

}