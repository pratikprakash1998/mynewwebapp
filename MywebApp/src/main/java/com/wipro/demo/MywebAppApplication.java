package com.wipro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MywebAppApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(MywebAppApplication.class, args);
	}

}
