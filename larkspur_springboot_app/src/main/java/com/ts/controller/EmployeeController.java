package com.ts.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/emp-data")
	public String empData() {
		return "We are in EMP-DATA method.";
	}
	
	
	@GetMapping("/get-emp")
	public Employee getById(@RequestParam("id") int id) {
		
		List<Employee> employees = new ArrayList<>();
		
		Employee emp1 = new Employee(1, "Vinod", "IT");
		Employee emp2 = new Employee(4, "Don", "BOSS");
		Employee emp3 = new Employee(5, "Aliya", "Admin");
		Employee emp4 = new Employee(7, "Ramu Kaka", "IT");
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
				
		Employee result = new Employee();
		
		for(Employee emp : employees) {
			
			if(emp.getId() == id) {
				result = emp;
				break;
			}
		}
		
		return result;
		
		
		
		
		
	}
}
