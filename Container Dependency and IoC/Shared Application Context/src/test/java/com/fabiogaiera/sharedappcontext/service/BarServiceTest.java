package com.fabiogaiera.sharedappcontext.service;

import com.fabiogaiera.sharedappcontext.config.AppConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class BarServiceTest {

    @Autowired
    private BarService barService;

    @Test
    public void testBarService() {
        assertEquals("Service from Foo", barService.serviceFromBar());
    }

}