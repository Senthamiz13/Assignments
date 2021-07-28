package REST.Assignments.REST.Q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	////// get all employee///////
	public List<Employee>  getAllEmplyee() {
		List<Employee> newEmployeeList = new ArrayList<>();
		repository.findAll().forEach(newEmployeeList::add);
		return newEmployeeList;
	}
	
	//////////get employee/////////
	public Optional<Employee> getEmployee(String id) {
		return repository.findById(id);
	}
	
	////////add employee//////////
	public void addEmployee(Employee employee) {repository.save(employee);}

	///////update employee///////
	public void updateEmployee( String id, Employee employee) {
		repository.save(employee);}
	
	///////Delete employee///////
	public void deleteEmployee(String id) {repository.deleteById(id);}

}
