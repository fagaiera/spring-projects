package com.fabiogaiera.reflectiontestutils.model;

import com.fabiogaiera.reflectiontestutils.config.AppConfig;
import com.fabiogaiera.reflectiontestutils.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class PersonTest {

    @Autowired
    private PersonService personService;

    @Test
    public void testGetId() {
        Person person = personService.newPerson();
        ReflectionTestUtils.setField(person, "id", 123456);
        assertEquals("Verifying that the person's ID (private field in the Person class) was set.", 123456, person.getId());
    }

}