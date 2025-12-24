package com.dec24stsapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	
	@GetMapping("/message")
	
	public String getName() {
		return "hele da mapla";
	}
}
