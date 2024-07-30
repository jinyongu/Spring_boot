package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Eliminate verbosity in creating Java Beans
// Public accessor methods, constructor,
// equals, hashcode and toString are automatically created
//Released in JDK 16.

record Person (String name, int age) {}; // getter & setter 필요 없음
record Adress (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Woo Jin Yong";
	}
	
	@Bean
	public int age() {
		return 21;
	}
	
	@Bean
	public Person person() {
		return new Person("Ravi", 20);
	}
	
	@Bean
	public Adress adress() {
		return new Adress("Baker Street", "London");
	}

}
