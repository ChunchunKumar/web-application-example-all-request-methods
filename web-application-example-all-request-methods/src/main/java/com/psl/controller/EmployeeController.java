package com.psl.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.psl.model.Employee;
import com.psl.repository.EmployeeDaoImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDaoImpl employeeDaoImpl;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees() {
		return employeeDaoImpl.getAllEmployee();	
	}
	
	@GetMapping(path = "employee/{empId}")
	public Employee getEmployeeByID(@PathVariable int empId) {
		return employeeDaoImpl.getEmployeeById(empId);	
	}
	
	@PostMapping(path = "/employee")
	public void saveEmployee(@RequestBody Employee employee) {
		employeeDaoImpl.saveEmployee(employee);
	}
	
	@PutMapping(path = "/employee")
	public void updateEmployee(@RequestBody Employee employee)
	{
		employeeDaoImpl.updateEmployee(employee);
	}
	
	@DeleteMapping(path ="employee/{empId}" )
	public void deleteEmployee(@PathVariable int empId) {
		employeeDaoImpl.deleteEmployeeById(empId);
		
	}

}
