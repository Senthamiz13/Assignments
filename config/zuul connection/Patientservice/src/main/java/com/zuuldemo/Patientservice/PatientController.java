package com.zuuldemo.Patientservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	
	@GetMapping("/patients")
	public String getpatient()
	{
		return "List of Patients";
	}

}
