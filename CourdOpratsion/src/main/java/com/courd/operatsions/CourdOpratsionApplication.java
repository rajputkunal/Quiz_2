package com.courd.operatsions;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.courd.operatsions")
@SpringBootApplication
public class CourdOpratsionApplication extends SpringBootServletInitializer{

	private static Class applicationClass = CourdOpratsionApplication.class;
	
	public static void main(String[] args) {
		SpringApplication.run(CourdOpratsionApplication.class, args);
	}
}

