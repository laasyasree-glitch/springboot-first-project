package com.springbootproject.firstspringbootproject;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootproject.firstspringbootproject.configuration.BasicConfiguration;

@RestController
public class WelcomeController {
	
	
	//Auto-wiring
	@Autowired
	private WelcomeService service;
	
	@Autowired
	private BasicConfiguration configuration;
	
		@RequestMapping("/welcome")
		public String welcome() {
			return service.retrieveWelcomeMessage();
		}
		@RequestMapping("/dynamic-configuration")
		public Map dynamicConfig() {
			Map map=new HashMap();
			map.put("message", configuration.getMessage());
			map.put("number", configuration.getNumber());
			map.put("value", configuration.getValue());
			return map;
		}

}

//To scan in other package we need to use ComponentScan
//By default search in same package
/*@Repository Annotation is a specialization of @Component 
 annotation which is used to indicate that the class provides 
 the mechanism for storage, retrieval, update, delete 
 and search operation on objects.*/
