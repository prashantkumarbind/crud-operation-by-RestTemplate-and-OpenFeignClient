package com.pksoftware.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pksoftware.dao.EmployeeDao;
import com.pksoftware.entity.Employee;
import com.pksoftware.service.EmployeeService;

@Component
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public Employee insert(Employee employee) {
		Employee employee2 = employeeDao.save(employee);
		return employee2;
	}

	@Override
	public Employee update(Employee employee) {
		Employee emp = null;
		Optional<Employee> opt = employeeDao.findById(employee.getId());
		if(!(opt.isEmpty()))
		{
			  emp = employeeDao.save(employee);
		}
		return emp;
	}

	@Override
	public List<Employee> select() {
		List<Employee> list = employeeDao.findAll();
		return list;
	}

	@Override
	public String delete(int id) {
		String message = "not found";
		Optional<Employee>  opt = employeeDao.findById(id);
		if(!(opt.isEmpty()))
		{
			   employeeDao.deleteById(id);
			   message = "successfully deleted";
		}
		return message;
	}

	@Override
	public Employee getById(int id) {
		Employee emp = null;
		Optional<Employee> opt = employeeDao.findById(id);
		if(!(opt.isEmpty()))
		{
			   emp = opt.get();
		}
		return emp;
	}

}
