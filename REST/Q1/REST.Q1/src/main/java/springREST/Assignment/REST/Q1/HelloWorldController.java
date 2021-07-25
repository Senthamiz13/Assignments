package springREST.Assignment.REST.Q1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	//Autowiring to HelloWorldService
	@Autowired
	HelloWorldService helloWorldService;
	
	//Mapping for the path
	@GetMapping("/greeting")
	public String sayHello() {
		return helloWorldService.print();
	}
}	