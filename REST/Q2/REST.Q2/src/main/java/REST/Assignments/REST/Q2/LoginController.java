package REST.Assignments.REST.Q2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
	
	@Autowired
	UserAuthService authService;
	
	@PostMapping("/login")
	public String checkUser(@RequestBody User myuser){
		System.out.println(myuser.getUsername()+" "+myuser.getPassword());
		return  authService.check(myuser);
	}
	
	@RequestMapping("/all")
	public List<User> alltopics() {
		
		return authService.allusers();
	}

}