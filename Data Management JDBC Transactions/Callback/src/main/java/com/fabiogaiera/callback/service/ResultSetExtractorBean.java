package com.fabiogaiera.callback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultSetExtractorBean {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<String> getAllCitiesNonLambda() {

        return jdbcTemplate.query("SELECT Name FROM city ORDER BY ID", new ResultSetExtractor<List<String>>() {
            @Override
            public List<String> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
                List<String> listOfCities = new ArrayList<>();
                while (resultSet.next()) {
                    listOfCities.add(resultSet.getString(1));
                }
                return listOfCities;
            }
        });

    }

    public List<String> getAllCitiesLambda() {

        return jdbcTemplate.query("SELECT Name FROM city ORDER BY ID", resultSet -> {
            List<String> listOfCities = new ArrayList<>();
            while (resultSet.next()) {
                listOfCities.add(resultSet.getString(1));
            }
            return listOfCities;
        });

    }

}