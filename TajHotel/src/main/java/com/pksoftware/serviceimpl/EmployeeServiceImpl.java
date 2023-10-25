package com.pksoftware.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pksoftware.dao.EmployeeDao;
import com.pksoftware.entity.Employee;
import com.pksoftware.service.EmployeeService;

@Controller
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	
	@Override
	public Employee insert(Employee employee) {
		Employee emp = dao.save(employee);
		return emp;
	}

	@Override
	public Employee update(Employee employee) {
		Employee emp = null;
		Optional<Employee> opt = dao.findById(employee.getId());
		if(!(opt.isEmpty()))
		{
			  dao.save(employee);
			  emp = opt.get();
		}
		return emp;
	}

	@Override
	public String delete(int id) {
		String message = "not found";
		Optional<Employee> opt = dao.findById(id);
		if(!(opt.isEmpty()))
		{
			 dao.deleteById(id);
			 message = "successfully deleted";
		}
		return message;
	}

	@Override
	public List<Employee> select() {
		List<Employee> list = dao.findAll();
		return list;
	}

	@Override
	public Employee getById(int id) {
		Employee emp = null;
		Optional<Employee> opt = dao.findById(id);
		if(!(opt.isEmpty()))
		{
			  emp = opt.get();
		}
		return emp;
	}
}
