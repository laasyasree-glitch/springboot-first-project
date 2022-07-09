package com.springbootproject.firstspringbootproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.springbootproject.firstspringbootproject.jpa.User;
import com.springbootproject.firstspringbootproject.jpa.UserCommandLineRunner;
import com.springbootproject.firstspringbootproject.jpa.UserRepository;

@SpringBootApplication
public class Application {
	@Autowired
	private UserRepository repository;

	private static final Logger log = LoggerFactory
			.getLogger(UserCommandLineRunner.class);
	
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Application.class, args);
	}
	@Profile("prod")
	@Bean
	public String dummy() {
		return "Hello";
	}
	

}
