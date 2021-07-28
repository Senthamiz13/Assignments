package com.empClass;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeRegister {

	private List<Employee> empList = new ArrayList<>();

	private EmployeeRegister() {
		this.empList.add(new Employee(1, "Lucifer", 250000));
		this.empList.add(new Employee(2, "Ella", 70000));
		this.empList.add(new Employee(3, "Chloe", 30000));
		this.empList.add(new Employee(4, "Maze", 36000));
		this.empList.add(new Employee(5, "Dan", 45000));
		this.empList.add(new Employee(6, "Michael", 33000));
		this.empList.add(new Employee(7, "Pam", 640000));
		this.empList.add(new Employee(8, "Jim", 70000));
		this.empList.add(new Employee(9, "Dwight", 125000));
		this.empList.add(new Employee(10, "Alexis", 178000));
		this.empList.add(new Employee(11, "Moira", 100000));
		this.empList.add(new Employee(12, "Johnny", 52000));
		this.empList.add(new Employee(13, "Angela", 28000));
		this.empList.add(new Employee(14, "Kevin", 54000));
		this.empList.add(new Employee(15, "Jan", 270000));
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

}
