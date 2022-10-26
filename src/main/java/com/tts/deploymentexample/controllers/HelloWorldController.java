package com.tts.deploymentexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping(path="/")
	public String helloWorld() {
		return "helloworld";
	}
	
}
