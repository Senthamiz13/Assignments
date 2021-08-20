package com.zuuldemo.Doctorservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {
	
	@GetMapping("/doctors")
	public String getpatient()
	{
		return "List of doctors";
	}


}
