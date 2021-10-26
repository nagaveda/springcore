package com.nagaveda.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLangs {
	private Properties countriesAndLangs;

	public Properties getCountriesAndLangs() {
		return countriesAndLangs;
	}

	public void setCountriesAndLangs(Properties countriesAndLangs) {
		this.countriesAndLangs = countriesAndLangs;
	}

	@Override
	public String toString() {
		return "CountriesAndLangs [countriesAndLangs=" + countriesAndLangs + "]";
	}
	
}
