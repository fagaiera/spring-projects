package com.fabiogaiera.contextconfiguration.bean;

import com.fabiogaiera.contextconfiguration.config.AppConfigTwo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfigTwo.class)
public class ChildClassTest extends BaseClassTest {

    @Autowired
    private MyBean firstBean;

    @Autowired
    private MyBean secondBean;

    @Test
    public void testFirstBean() {

        assertNotNull(firstBean);
        assertTrue(firstBean.getMessage().contains("AppConfigOne"));

    }

    @Test
    public void testSecondBean() {

        assertNotNull(secondBean);
        assertTrue(secondBean.getMessage().contains("AppConfigTwo"));

    }

}