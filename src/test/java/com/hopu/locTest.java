package com.hopu;

import com.hopu.ioc.User;
import com.sun.org.apache.bcel.internal.util.ClassPath;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class locTest {
    @Test
    public void testIoc() {
        ApplicationContext act =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");
        User user = (User) act.getBean("user");
        user.study();

    }
}
