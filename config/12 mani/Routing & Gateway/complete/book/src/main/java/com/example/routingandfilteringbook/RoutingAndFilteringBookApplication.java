package com.example.routingandfilteringbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RoutingAndFilteringBookApplication {

	@RequestMapping(value = "/available")
	public String available() {
		return "List of all Available Books";
	}

	@RequestMapping(value = "/checked-out")
	public String checkedOut() {
		return "List of all Checked out Books";
	}

	public static void main(String[] args) {
		SpringApplication.run(RoutingAndFilteringBookApplication.class, args);
	}
}
