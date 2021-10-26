package com.nagaveda.spring.springcore.refTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("com/nagaveda/spring/springcore/refTypes/refTypesconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		System.out.println(student.getScores().getClass().getName());

	}

}
