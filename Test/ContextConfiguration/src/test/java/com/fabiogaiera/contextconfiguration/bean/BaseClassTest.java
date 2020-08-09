package com.fabiogaiera.contextconfiguration.bean;

import com.fabiogaiera.contextconfiguration.config.AppConfigOne;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfigOne.class)
public class BaseClassTest {

    @Test
    public void test() {

    }

}