package com.nagaveda.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/nagaveda/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLangs countriesAndLangs = (CountriesAndLangs) context.getBean("countriesAndLangs");
		System.out.println(countriesAndLangs.getCountriesAndLangs().getClass().getName());
	}

}
