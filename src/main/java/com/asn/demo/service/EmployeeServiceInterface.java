package com.asn.demo.service;

import java.util.List;

import com.asn.demo.entity.Employee;

public interface EmployeeServiceInterface {
	
	public Employee addEmployee(Employee emp);
	
	public List<Employee> getEmployeeList();
	
	public Employee getEmployee(Long id);

	public Employee updateEmployee(Employee emp);

	 void deleteEmployee(Employee emp);

}
