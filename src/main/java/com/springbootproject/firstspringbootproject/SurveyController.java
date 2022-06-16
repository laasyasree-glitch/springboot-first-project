package com.springbootproject.firstspringbootproject;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
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
	public List<Question> retriveQuestionForSurvey(@PathVariable String surveyId ){
		
		return surveyService.retrieveQuestions(surveyId);
	}
	
	// What should be structure of request body ?
	// How will it be manned to Question object ? JSON=>QUESTION OBJECT
	// What should be returned ?
	//What should be response status ?
	@PostMapping("/surveys/{surveyId}/questions")
    ResponseEntity<?> add(@PathVariable String surveyId,
            @RequestBody Question question) {

        Question createdTodo = surveyService.addQuestion(surveyId, question);

        if (createdTodo == null) {
            return ResponseEntity.noContent().build();
        }

       URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(createdTodo.getId()).toUri();

        return ResponseEntity.created(location).build();

    }
    
    @GetMapping("/surveys/{surveyId}/questions/{questionId}")
	public Question retriveQuestion(@PathVariable String surveyId,@PathVariable String questionId ){
		
		return surveyService.retrieveQuestion(surveyId,questionId);
	}

}
