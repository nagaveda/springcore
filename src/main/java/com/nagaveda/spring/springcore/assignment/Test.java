package com.nagaveda.spring.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nagaveda/spring/springcore/assignment/assignmentconfig.xml");
		ShoppingCart cart = (ShoppingCart) context.getBean("cart");
		System.out.println(cart);
	}
}
