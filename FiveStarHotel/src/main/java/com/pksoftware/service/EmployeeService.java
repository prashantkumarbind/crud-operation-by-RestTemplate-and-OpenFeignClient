package com.pksoftware.service;

import java.util.List;

import com.pksoftware.entity.Employee;

public interface EmployeeService {

		Employee insert(Employee employee);
		Employee update(Employee employee);
		List<Employee> select();
		String delete(int id);
		Employee getById(int id);
}
