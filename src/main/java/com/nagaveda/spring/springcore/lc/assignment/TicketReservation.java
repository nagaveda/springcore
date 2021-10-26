package com.nagaveda.spring.springcore.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
    @PostConstruct
    public void initialize(){
        System.out.println("Initialisation..");
    }

    @PreDestroy
    public void cleanup(){
        System.out.println("Cleanup code prior to destroying of the bean!");
    }
}
