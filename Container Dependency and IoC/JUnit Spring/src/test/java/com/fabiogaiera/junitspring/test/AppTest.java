package com.fabiogaiera.junitspring.test;

import com.fabiogaiera.junitspring.config.AppConfig;
import com.fabiogaiera.junitspring.model.Order;
import com.fabiogaiera.junitspring.service.SampleService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class AppTest {

    @Autowired
    private SampleService sampleService;

    @BeforeClass
    public static void start() {
        System.out.println("-----> START <-----");
    }

    @Test
    public void testSampleService() {
        assertEquals("class com.fabiogaiera.junitspring.service.SampleServiceImpl", this.sampleService.getClass().toString());
    }

    @Test
    public void testSampleServiceCreateNewOrder() {

        Order newOrder = new Order();
        assertNotNull("Order is not null", newOrder);
        assertThat(sampleService.createOrder(newOrder), instanceOf(Order.class));

    }

    @Test
    public void testSampleServiceGetOrder() {

        Order existingOrder = sampleService.getOrder(0);
        assertNotNull("Order is not null", existingOrder);
        assertThat(sampleService.getOrder(0), instanceOf(Order.class));

    }

    @AfterClass
    public static void end() {
        System.out.println("-----> END <-----");
    }

}