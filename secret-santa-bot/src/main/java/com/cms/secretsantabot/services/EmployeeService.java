package com.cms.secretsantabot.services;

import java.util.List;

import com.cms.secretsantabot.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee getEmployeesById(int id);
	public Employee addEmployee(Employee employee);
}
