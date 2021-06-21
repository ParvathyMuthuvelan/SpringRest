package com.training.dao;

import java.util.List;

import com.training.bean.Employee;



public interface EmployeeDao {
	List<Employee> fetchEmployees();

Employee addEmployee(Employee emp);

	Employee getEmployee(int empId);

	void updateEmployee(Employee emp);

	void deleteEmployee(int empId);
}
