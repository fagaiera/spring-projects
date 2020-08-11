package com.fabiogaiera.junitspring.test;

import com.fabiogaiera.junitspring.config.AppConfig;
import com.fabiogaiera.junitspring.service.SampleService;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class SampleServiceTest {

    @Autowired
    private SampleService sampleService;

    @BeforeClass
    public static void start() {
        System.out.println("-----> START <-----");
    }

    @Test
    public void testCreateOrder() {

        assertEquals("XYZ", sampleService.createOrder().getSecurityCode());

    }

    @Test
    public void testGetOrder() {

        assertEquals("XYZ", sampleService.getOrder(0).getSecurityCode());

    }

    @AfterClass
    public static void end() {
        System.out.println("-----> END <-----");
    }

}