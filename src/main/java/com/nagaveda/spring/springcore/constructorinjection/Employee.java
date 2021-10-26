package com.nagaveda.spring.springcore.constructorinjection;

public class Employee {
    private int id;
    private Address address;

    public Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [address=" + address + ", id=" + id + "]";
    }

}
