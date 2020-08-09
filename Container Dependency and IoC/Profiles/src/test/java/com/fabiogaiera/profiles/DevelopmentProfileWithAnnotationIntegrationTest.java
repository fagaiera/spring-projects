package com.fabiogaiera.profiles;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("development")
@ContextConfiguration(classes = {SpringProfilesConfig.class}, loader = AnnotationConfigContextLoader.class)
public class DevelopmentProfileWithAnnotationIntegrationTest {

    @Autowired
    private DataSourceConfig dataSourceConfig;

    @Autowired
    private Environment environment;

    @Test
    public void testSpringProfiles() {
        for (final String profileName : environment.getActiveProfiles()) {
            System.out.println("Currently active profile: " + profileName + ".");
        }
        Assert.assertEquals("development", environment.getActiveProfiles()[0]);
        Assert.assertTrue(dataSourceConfig instanceof DevDataSourceConfig);
    }

}