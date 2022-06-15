package com.springbootproject.firstspringbootproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
" / surveys / { surveyId } / questions / {questionId}"
SurveyController
SurveyService - Auto-wire
PathVariable - surveyId
surveys / Survey1 / questions 
SurveyService
SurveyService . retrieveQuestions ( surveyId )*/
@RestController
public class SurveyController {
	
	@Autowired
	private SurveyService surveyService;
	
	@GetMapping("/surveys/{surveyId}/questions")
	public List<Question> retriveQuestionForSurvey(@PathVariable String surveyId){
		
		return surveyService.retrieveQuestions(surveyId);
	}
	@GetMapping("/surveys/{surveyId}/questions/{questionId}")
	public Question retriveDetailsOfQuestion(@PathVariable String surveyId,@PathVariable String questionId){
		
		return surveyService.retrieveQuestion(surveyId, questionId);
	}

}
