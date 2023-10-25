package com.pksoftware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pksoftware.entity.Employee;
import com.pksoftware.service.EmployeeService;

@RestController
public class EmployeeController {

		@Autowired
		EmployeeService service;
	
		@GetMapping("/testing/{name}")
		public String test(@PathVariable String name) {
			   return "Your Input Name::"+name;
		}
		
		  @PostMapping("/tajemployee")
		  public Employee insert(@RequestBody Employee employee) {
			     Employee employee2 = service.insert(employee); 
			     return employee2;
		  }
		  
		  @PutMapping("/tajemployee")
		  public Employee update(@RequestBody Employee employee) {
			     Employee emp = service.update(employee);
			     return emp;
		  }
		  
		  @GetMapping("/tajemployee")
		  public List<Employee> select(){
			     List<Employee> list = service.select();
			     return list;
		  }
		  
		  @DeleteMapping("/tajemployee/{id}")
		  public String delete(@PathVariable int id) {
			     String message = service.delete(id);
			     return message;
		  }
		  
		  @GetMapping("/tajemployee/{id}")
		  public Employee getById(@PathVariable int id) {
			     Employee emp = service.getById(id);
			     return emp;
		  }	
}
