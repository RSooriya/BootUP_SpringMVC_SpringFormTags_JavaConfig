package com.sooriya.Entity;

import java.util.LinkedHashMap;

public class Student2 {

	private String name;
	
	private String country;
	
	private String gender;
	
	private String[] languages;
	
	private LinkedHashMap<String,String> countryOptions;
	
	private LinkedHashMap<String,String> genderOptions;
	
	private LinkedHashMap<String,String> languageOptions;
	
	public Student2()
	{
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("India", "India");
		countryOptions.put("United Kingdom", "UK");
		countryOptions.put("China", "China");
		genderOptions = new LinkedHashMap<>();
		genderOptions.put("Male", "Male");
		genderOptions.put("Female", "Female");
		languageOptions = new LinkedHashMap<>();
		languageOptions.put("Java", "Java");
		languageOptions.put("C", "C");
        languageOptions.put("Python", "Python");
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public LinkedHashMap<String, String> getGenderOptions() {
		return genderOptions;
	}

	public LinkedHashMap<String, String> getLanguageOptions() {
		return languageOptions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getLanguages() {
		return languages;
	}

	public void setLanguages(String[] languages) {
		this.languages = languages;
	}


	
	
}
 
