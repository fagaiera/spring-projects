package com.fabiogaiera.callback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class RowMapperBean {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getAllCitiesNonLambda() {
        return jdbcTemplate.query("SELECT Name FROM city ORDER BY ID", new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet resultSet, int i) throws SQLException {
                return resultSet.getString(1);
            }
        });
    }

    public List<String> getAllCitiesLambda() {
        return jdbcTemplate.query("SELECT Name FROM city ORDER BY ID", (resultSet, i) -> resultSet.getString(1));
    }

}