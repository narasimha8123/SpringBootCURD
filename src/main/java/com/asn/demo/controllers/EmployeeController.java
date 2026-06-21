package com.asn.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.asn.demo.entity.Employee;
import com.asn.demo.service.EmployeeServiceInterface;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInterface employeeServiceInterface;
	
	@GetMapping("/test")
	public String test(){
				
		return "Heloo";		
	}
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee employeeSave = employeeServiceInterface.addEmployee(employee);		
		return new ResponseEntity<Employee>(employeeSave,HttpStatus.CREATED);		
	}

	@GetMapping("/retrive")
	public ResponseEntity<List<Employee>> getEmployeeList(){
		List<Employee> employList = employeeServiceInterface.getEmployeeList();
		return new ResponseEntity<>(employList,HttpStatus.OK);
	}
	
	@GetMapping("/getEmployee/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
		Employee employee = employeeServiceInterface.getEmployee(id);
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<Employee> putMethodName(@RequestBody Employee emp) {
		Employee empUpdate = employeeServiceInterface.updateEmployee(emp);
		return new ResponseEntity<Employee>(empUpdate,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete")
	public ResponseEntity<Void> deleteEmployee(@RequestBody Employee emp){
		employeeServiceInterface.deleteEmployee(emp);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
}
