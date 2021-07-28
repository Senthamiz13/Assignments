package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/")
	public String display() {
		return("<h1>Hello World</h1> <a href=\"http://localhost:8080/login\">logout</a>");
	}

}
