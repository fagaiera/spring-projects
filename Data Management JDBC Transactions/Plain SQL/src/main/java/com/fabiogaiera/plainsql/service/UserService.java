package com.fabiogaiera.plainsql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.StatementCallback;

import java.sql.ResultSet;

public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void performStatementCallback() {
        jdbcTemplate.execute((StatementCallback<ResultSet>) statement -> {
            ResultSet rs = statement.executeQuery("SELECT * FROM city");
            RowCallbackHandler handler = resultSet -> {
                while (resultSet.next()) {
                    System.out.println(resultSet.getObject(2));
                }
            };
            handler.processRow(rs);
            return rs;
        });
    }

}