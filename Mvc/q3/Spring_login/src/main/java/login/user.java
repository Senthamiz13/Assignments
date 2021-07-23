package login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class user {
	
	@RequestMapping(value = "/val", method = RequestMethod.POST)
	public String name(@RequestParam String username, 
			@RequestParam String password, ModelMap model) {
		//model.put("username", username);
		//model.put("password", password);
		
		if (username.equals("Sen") & password.equals("pass")) {
			return "success";
		}
		else return "error";
	}
}
