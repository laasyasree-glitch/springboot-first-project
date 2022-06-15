package com.springbootproject.firstspringbootproject;

import org.springframework.stereotype.Service;

@Service //or Component
public class WelcomeService{
	public String retrieveWelcomeMessage() {
		//Complex Method
		return "Good Morning updated!!";
	}
}