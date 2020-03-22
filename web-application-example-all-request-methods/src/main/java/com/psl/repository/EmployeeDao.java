package com.psl.repository;

import java.util.List;
import com.psl.model.Employee;

public interface EmployeeDao{
	public List<Employee> getAllEmployee();
	public Employee	getEmployeeById(int id);
	public void saveEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public void deleteEmployeeById(int empID);
}
