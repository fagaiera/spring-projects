package com.fabiogaiera.contextconfiguration.service;

import com.fabiogaiera.contextconfiguration.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
@TestPropertySource(properties = {"name.method1=test"})
public class Service2Test {

    private Service2 service2;

    @Test
    public void testMethodFromService2() {

        assertNotNull(service2);
        assertEquals("Executing test", service2.methodFromService2());

    }

    @Autowired
    public void setService2(Service2 service2) {
        this.service2 = service2;
    }

}