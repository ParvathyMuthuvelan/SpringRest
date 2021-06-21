package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.bean.Employee;
import com.training.service.EmployeeServiceImpl;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeService;

	@GetMapping("/getEmployees")
	public List<Employee> getEmployees() {
		List<Employee> empList = employeeService.fetchEmployees();

		return empList;

	}

	@PostMapping("/addEmployee")
	public ResponseEntity<Object> addEmployee(@RequestBody Employee emp) {

		Employee employee = employeeService.addEmployee(emp);
		
			return new ResponseEntity<>("Employee added successsfully", HttpStatus.OK);
	}

	@PutMapping(value = "/updateEmployee")
	public ResponseEntity<Object> updateEmployee(@RequestBody Employee emp) {

		employeeService.updateEmployee(emp);

		return new ResponseEntity<>("Employee updated successsfully", HttpStatus.OK);

	}

	@DeleteMapping(value = "/deleteEmployee/{employeeId}")
	public ResponseEntity<Object> deleteEmployee(@PathVariable("employeeId") int empId) {

		employeeService.deleteEmployee(empId);
		return new ResponseEntity<>("Employee deleted successsfully", HttpStatus.OK);
	}

}
