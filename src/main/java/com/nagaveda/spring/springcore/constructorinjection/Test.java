package com.nagaveda.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/nagaveda/spring/springcore/constructorinjection/config.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);

        // Employee employee1 = (Employee) context.getBean("employee");
        // System.out.println(employee1.hashCode());
    }
}
