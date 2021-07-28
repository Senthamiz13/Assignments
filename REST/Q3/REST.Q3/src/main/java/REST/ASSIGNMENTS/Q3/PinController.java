package REST.ASSIGNMENTS.Q3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PinController {
	
	@Autowired
	PincodeService pincodeService;

	@GetMapping("/find/{pincode}")
	public Pincode get(@PathVariable int pincode) {
		System.out.println(pincode);
		return pincodeService.getDetails(pincode);	
	}
	
	@GetMapping("/find/all")
	public List<Pincode> get() {
		return pincodeService.getall();	
	}
	
	
}
