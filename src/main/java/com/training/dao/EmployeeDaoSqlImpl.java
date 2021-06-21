package com.training.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.training.bean.Employee;

@Repository
public class EmployeeDaoSqlImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> fetchEmployees() {
		String sql = "select * FROM employees";
		List<Employee> empList = jdbcTemplate.query(sql, new EmployeeMapper());
		return empList;

	}

	@Override
	public Employee addEmployee(Employee emp) {
		String sql = "insert into employees values (?,?,?,?)";
		jdbcTemplate.update(sql,
				new Object[] { emp.getEmployeeId(), emp.getFirstName(), emp.getLastName(), emp.getEmail() });
		Employee employee = getEmployee(emp.getEmployeeId());
		return emp;
	}

	@Override
	public Employee getEmployee(int empId) {

		String sql = "select * from employees where employeeId = ?";
		Employee emp = jdbcTemplate.queryForObject(sql, new Object[] { empId }, new EmployeeMapper());
		return emp;
	}

	@Override
	public void updateEmployee(Employee emp) {
		String sql = "update employees set firstname=?,lastname=?,email=? where employeeId = ?";
		jdbcTemplate.update(sql, emp.getFirstName(), emp.getLastName(), emp.getEmail(), emp.getEmployeeId());

	}

	@Override
	public void deleteEmployee(int empId) {
		String SQL = "delete from employees where employeeId = ?";
		jdbcTemplate.update(SQL, empId);

	}

}
