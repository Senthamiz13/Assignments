package REST.Assignments.REST.Q5;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	////// get all employee///////
	@RequestMapping("/employee")
	public List<Employee> getAllEmplyee() {
		return service.getAllEmplyee();
	}
	
	//////////get employee/////////
	@RequestMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable String id) {
		return service.getEmployee(id);
	}
	
	////////add employee//////////
	@RequestMapping(method = RequestMethod.POST, value = "/employee")
	public void addEmployee(@RequestBody Employee employee) {
		service.addEmployee(employee);
	}
	
	///////update employee///////
	@RequestMapping(method = RequestMethod.PUT, value = "/employee/{id}")
	public void updateEmployee
	(@RequestBody Employee employee, @PathVariable String id) {
		service.updateEmployee(id, employee);
	}
	
	//////////delete employee////////////
	@RequestMapping(method = RequestMethod.DELETE, value = "/employee/{id}")
	public void deleteEmployee(@PathVariable String id) {
		service.deleteEmployee(id);
	}
	
}
