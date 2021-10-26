package com.nagaveda.spring.springcore.constructorinjection.ambiguity.variation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/nagaveda/spring/springcore/constructorinjection/ambiguity/variation/config.xml");
        Addition addition = (Addition) context.getBean("addition");
    }
}
