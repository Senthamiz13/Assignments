package SI;
import javax.persistence.metamodel.SetAttribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleInterestController {
	
	/*
	public String print() {
		return "result";
	}*/
	@RequestMapping(value = "/calculate")
	public String calculate(@RequestParam("principle") int princilple,
			@RequestParam("time") int time ,@RequestParam("rate") int rate,Model m)
	{
		double res = (princilple*time*rate/100);
		m.addAttribute("res", res);
		return "result";
	}
}
