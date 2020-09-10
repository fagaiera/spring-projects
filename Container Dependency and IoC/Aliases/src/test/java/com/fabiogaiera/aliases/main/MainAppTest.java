package com.fabiogaiera.aliases.main;

import com.fabiogaiera.aliases.bean.SomeBean;
import com.fabiogaiera.aliases.conf.AppConf;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConf.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public class MainAppTest {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void testMain() {

        SomeBean someBean1 = ctx.getBean("beanOne", SomeBean.class);
        SomeBean someBean2 = ctx.getBean("beanTwo", SomeBean.class);
        assertEquals(someBean1, someBean2);
        assertThrows(NoSuchBeanDefinitionException.class, () -> {
            ctx.getBean("someBean", SomeBean.class);
        });

    }

}