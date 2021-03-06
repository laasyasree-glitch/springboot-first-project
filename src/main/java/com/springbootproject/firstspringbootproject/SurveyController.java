package com.springbootproject.firstspringbootproject;

import java.net.URI;
import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.springboot.web.springbootfirstwebapplication.controller.TodoRepository;
<<<<<<< HEAD
import com.springbootproject.firstspringbootproject.jpa.SurveyRepository;
import com.springbootproject.firstspringbootproject.jpa.UserRepository;

@RestController //No need to use @ResponseBody
public class SurveyController {
	
	@Autowired
	SurveyRepository repository1;
=======
import com.springbootproject.firstspringbootproject.jpa.UserRepository;
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
	UserRepository repository;
>>>>>>> 5f5578452f48ff02c533efa265035ab84027c0af
	
	@Autowired
	private SurveyService surveyService;
	
	
	@GetMapping("/surveys/{surveyId}/questions")
	public List<Question> retriveQuestionForSurvey(@PathVariable int surveyId, ModelMap model){
		return surveyService.retrieveQuestions(surveyId);
		//return surveyRepository.findByQuestionId(surveyId);
	}
	
	@PostMapping("/surveys/{surveyId}/questions")
    ResponseEntity<?> add(@PathVariable int surveyId,
            @RequestBody Question question) {

        Question createdTodo = surveyService.addQuestion(surveyId, question);
		//Question createdTodo = surveyRepository.save(surveyId, question);
        if (createdTodo == null) {
            return ResponseEntity.noContent().build();
        }

       URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(createdTodo.getId()).toUri();   //Developing url for new question

        return ResponseEntity.created(location).build();

    }
    
    @GetMapping("/surveys/{surveyId}/questions/{questionId}")
	public Question retriveQuestion(@PathVariable int surveyId,@PathVariable int questionId ){
		
		return surveyService.retrieveQuestion(surveyId,questionId);
    	//return surveyRepository.findSpecificQuestion(surveyId,questionId);
	}

}
