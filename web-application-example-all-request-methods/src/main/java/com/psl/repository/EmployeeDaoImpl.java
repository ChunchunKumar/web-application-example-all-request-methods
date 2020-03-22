package com.psl.repository;

import java.util.List;
import java.util.Vector;
import org.springframework.stereotype.Service;
import com.psl.model.Address;
import com.psl.model.Employee;

@Service
public class EmployeeDaoImpl implements EmployeeDao {

	private static List<Employee> employeeDetails = new Vector<>();
	
	static {
		employeeDetails.add(new Employee(1, "Chunchun",
				new Address(1, "BlueRidege", "Hinjewadi phase1", "Pune", "Maha", "India", "123456")));
		employeeDetails.add(new Employee(2, "Chunchun2",
				new Address(2, "BlueRidege2", "Hinjewadi2 phase1", "Pune2", "Maha2", "India2", "123456")));
	}

	@Override
	public List<Employee> getAllEmployee() {

		return EmployeeDaoImpl.employeeDetails;
	}

	@Override
	public Employee getEmployeeById(int id) {
		for (Employee emp : employeeDetails) {
			if (emp.getId() == id) {
				return emp;
			} else
				continue;
		}
		return null;
	}

	@Override
	public void saveEmployee(Employee emp) {
		employeeDetails.add(emp);

	}

	@Override
	public void updateEmployee(Employee emp) {
		for (Employee employee : EmployeeDaoImpl.employeeDetails) {
			if (emp.getId() == employee.getId()) {
				employee.setName(emp.getName());
				employee.getAddress().setAddressLine1(emp.getAddress().getAddressLine1());
				employee.getAddress().setAddressLine1(emp.getAddress().getAddressLine1());
				employee.getAddress().setCity(emp.getAddress().getCity());
				employee.getAddress().setCountry(emp.getAddress().getCountry());
				employee.getAddress().setPincode(emp.getAddress().getPincode());
				employee.getAddress().setState(emp.getAddress().getState());

			} else
				continue;
		}

	}

	@Override
	public void deleteEmployeeById(int empId) {
		for (Employee emp : EmployeeDaoImpl.employeeDetails) {
			if (emp.getId() == empId) {
				EmployeeDaoImpl.employeeDetails.remove(emp);
			} else {
				continue;
			}
		}

	}

}
