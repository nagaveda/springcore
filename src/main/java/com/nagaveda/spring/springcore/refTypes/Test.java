package com.nagaveda.spring.springcore.refTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nagaveda/spring/springcore/refTypes/refTypesconfig.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		System.out.println(student.getScores().getClass().getName());
		
	}

}
