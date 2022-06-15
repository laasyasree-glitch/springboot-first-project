package com.springbootproject.firstspringbootproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	
	//Auto-wiring
	@Autowired
	private WelcomeService service;
	
		@RequestMapping("/welcome")
		public String welcome() {
			return service.retrieveWelcomeMessage();
		}

}

//To scan in other package we need to use ComponentScan
//By default search in same package
/*@Repository Annotation is a specialization of @Component 
 annotation which is used to indicate that the class provides 
 the mechanism for storage, retrieval, update, delete 
 and search operation on objects.*/
