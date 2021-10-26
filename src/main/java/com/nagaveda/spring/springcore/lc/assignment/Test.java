package com.nagaveda.spring.springcore.lc.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/nagaveda/spring/springcore/lc/assignment/config.xml");
        TicketReservation reservation = (TicketReservation) context.getBean("reservation");
        context.registerShutdownHook();
    }
}
