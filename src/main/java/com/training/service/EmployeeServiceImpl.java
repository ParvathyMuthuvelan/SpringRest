package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.bean.Employee;
import com.training.dao.EmployeeDao;


@Service
public class EmployeeServiceImpl {
@Autowired
	EmployeeDao empDao;

	


	public List<Employee> fetchEmployees() {
		List<Employee> empList=empDao.fetchEmployees();
		return empList;
	}

	
	public Employee addEmployee(Employee emp) {
		return empDao.addEmployee(emp);
		
	}

	
	public Employee getEmployee(int empId) {
		Employee emp=empDao.getEmployee(empId);
		return emp;
	}

	
	public void updateEmployee(Employee emp) {
		empDao.updateEmployee(emp);
		
	}

	
	public void deleteEmployee(int empId) {
		empDao.deleteEmployee(empId);
		
	}

}
