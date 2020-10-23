package com.fabiogaiera.genericqueries.service;

import com.fabiogaiera.genericqueries.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void performQuery() {
        jdbcTemplate.query("SELECT Name FROM city ORDER BY ID", resultSet -> {
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        });
    }

    // Many objects
    public void performQueryForObject() {
        Integer i = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM city", Integer.class);
        System.out.println("Rows: " + i);
    }

    // Many objects
    public void performQueryForList() {

        List<City> cities = new ArrayList<>();
        List<Map<String, Object>> rows = jdbcTemplate.queryForList("SELECT * FROM city");
        for (Map<String, Object> row : rows) {
            City city = new City();
            city.setName((String) row.get("Name"));
            city.setCountryCode((String) row.get("CountryCode"));
            city.setDistrict((String) row.get("District"));
            city.setPopulation((Integer) row.get("Population"));
            cities.add(city);
        }
        System.out.println(cities);

    }

    // One object
    public void performQueryForMap() {

        Map<String, Object> cityFromQuery = jdbcTemplate.queryForMap("SELECT * FROM city WHERE ID = 1");
        City city = new City();
        city.setName((String) cityFromQuery.get("Name"));
        city.setDistrict((String) cityFromQuery.get("District"));
        city.setCountryCode((String) cityFromQuery.get("CountryCode"));
        city.setPopulation((Integer) cityFromQuery.get("population"));
        System.out.println(city);

    }

}