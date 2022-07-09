package com.springbootproject.firstspringbootproject.jpa;

import java.util.List;
<<<<<<< HEAD
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.springbootproject.firstspringbootproject.Survey;

@Repository
public interface SurveyRepository extends CrudRepository<Survey,Integer>{
	//get all questions
	//get specific question
	//add a question
	
=======

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootproject.firstspringbootproject.Survey;
@Repository
public interface SurveyRepository extends CrudRepository<Survey,Long>{
	 List<Survey> findByRole(String description);
>>>>>>> 5f5578452f48ff02c533efa265035ab84027c0af
	
}
