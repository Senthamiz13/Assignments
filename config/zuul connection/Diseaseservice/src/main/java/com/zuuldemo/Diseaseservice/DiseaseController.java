package com.zuuldemo.Diseaseservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiseaseController {
	
	@GetMapping("/diseases")
	public String getpatient()
	{
		return "List of diseases";
	}


}
