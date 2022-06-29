package com.springbootproject.firstspringbootproject.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springbootproject.firstspringbootproject.Survey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component //At startup to initialize things
public class SurveyCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory
			.getLogger(SurveyCommandLineRunner.class);
	@Autowired
	private SurveyRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Survey("1", "laasya","On Springboot", null));
		for (Survey survey : repository.findAll()) {
			log.info(survey.toString());
		}
		log.info("Surveys are.....");
		log.info("____________________");
		/*for (Survey survey : repository.findByRole("Admin")) {
			log.info(survey.toString());
		}*/
		System.out.println("hello");
		
	}

}
