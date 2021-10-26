package com.nagaveda.spring.springcore.lc.xmlconfig;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("Inside setter method..");
        this.id = id;
    }

    public void hi(){
        System.out.println("Inside creation function...");
    }
    
    public void bye(){
        System.out.println("Inside destroy function...");
    }


    @Override
    public String toString() {
        return "Patient [id=" + id + "]";
    }
    
}
