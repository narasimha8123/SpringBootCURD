package com.asn.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asn.demo.entity.Employee;
import com.asn.demo.exception.BusinessException;
import com.asn.demo.exception.DataNotFoundDBException;
import com.asn.demo.exception.EmptyInputException;
import com.asn.demo.repos.EmployeeCURDRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService implements EmployeeServiceInterface{
	
	
@Autowired
EmployeeCURDRepo  employeeCURDRepo;

@Override
public Employee addEmployee(Employee emp) {
	if(emp.getName().isEmpty() ) {
		throw new EmptyInputException("Input field is empty, Please pass values","401");
	}
	Employee savedEmployee =  employeeCURDRepo.save(emp);
	
	return savedEmployee;
}

@Override
public List<Employee> getEmployeeList() {
	List<Employee> employeeList = employeeCURDRepo.findAll();
	
	if(employeeList.isEmpty()) {
		throw new DataNotFoundDBException("Data not present in dtabase","501");
	}
	return employeeList;
}

@Override
public Employee getEmployee(Long id) {
	
	Employee emp= employeeCURDRepo.getReferenceById(id);
	if(emp == null) {
		throw new BusinessException("501","Data not present in dtabase");
	}
	return emp;
}

@Override
public Employee updateEmployee(Employee emp) {
	if(emp.getName().isEmpty()) {
		throw new EmptyInputException("Input field is empty, Please pass values", "502");
	}
	Employee empUpdate = employeeCURDRepo.save(emp);
	
	return empUpdate;
}

@Override
public void deleteEmployee(Employee emp) {
	employeeCURDRepo.delete(emp);
	
}

}
