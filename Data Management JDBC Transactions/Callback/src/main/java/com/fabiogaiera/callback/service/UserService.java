package com.fabiogaiera.callback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplateWorldDb;

    @Autowired
    private JdbcTemplate jdbcTemplateSakilaDb;

    public void performRowCallbackHandler() {

        jdbcTemplateWorldDb.query("SELECT Name FROM city ORDER BY ID", resultSet -> {
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        });

    }

    public void performPreparedStatementCreator() {

        jdbcTemplateWorldDb.update(connection -> {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO city (Name, CountryCode, District, Population) VALUES (?, ?, ?, ?)");
            ps.setString(1, "Victoria");
            ps.setString(2, "ARG");
            ps.setString(3, "Buenos Aires");
            ps.setInt(4, 39447);
            return ps;
        });

    }

    @SuppressWarnings("unchecked")
    public void performCallableStatementCreator() {

        SqlParameter filmId = new SqlParameter(Types.INTEGER);
        SqlParameter storeId = new SqlParameter(Types.INTEGER);
        SqlOutParameter outParameter = new SqlOutParameter("msg", Types.INTEGER);

        List<SqlParameter> paramList = new ArrayList<>();
        paramList.add(filmId);
        paramList.add(storeId);
        paramList.add(outParameter);

        final String procedureCall = "{call film_in_stock(?, ?, ?)}";

        Map<String, Object> resultMap = jdbcTemplateSakilaDb.call(connection -> {

            CallableStatement callableStatement = connection.prepareCall(procedureCall);
            callableStatement.setInt(1, 1);
            callableStatement.setInt(2, 1);
            callableStatement.registerOutParameter(3, Types.INTEGER);
            return callableStatement;

        }, paramList);
        System.out.println(resultMap.get("msg"));

    }

}