package com.fabiogaiera.callback.main;

import com.fabiogaiera.callback.config.AppConfig;
import com.fabiogaiera.callback.service.ResultSetExtractorBean;
import com.fabiogaiera.callback.service.RowCallbackHandlerBean;
import com.fabiogaiera.callback.service.RowMapperBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        RowCallbackHandlerBean rowCallbackHandlerBean = context.getBean(RowCallbackHandlerBean.class);
        ResultSetExtractorBean resultSetExtractorBean = context.getBean(ResultSetExtractorBean.class);
        RowMapperBean rowMapperBean = context.getBean(RowMapperBean.class);

        rowCallbackHandlerBean.getAllCitiesNonLambda();
        System.out.println(resultSetExtractorBean.getAllCitiesNonLambda());
        System.out.println(rowMapperBean.getAllCitiesNonLambda());

        context.close();

    }

}