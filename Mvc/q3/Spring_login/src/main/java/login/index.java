package login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class index {

	@RequestMapping(value = "/index")
	public String login() {
		return "login";
	}
	
}
