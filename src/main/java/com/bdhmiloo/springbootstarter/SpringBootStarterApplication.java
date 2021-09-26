package com.bdhmiloo.springbootstarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStarterApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootStarterApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStarterApplication.class, args);
	}
}
