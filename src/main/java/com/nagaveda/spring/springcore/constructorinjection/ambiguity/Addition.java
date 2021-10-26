package com.nagaveda.spring.springcore.constructorinjection.ambiguity;

public class Addition {
    public Addition(Double a, Double b) {
        System.out.println("Inside constructor Double");
    }

    public Addition(int a, int b) {
        System.out.println("Inside constructor INT");
    }

    public Addition(String a, String b) {
        System.out.println("Inside constructor String");
    }
}
