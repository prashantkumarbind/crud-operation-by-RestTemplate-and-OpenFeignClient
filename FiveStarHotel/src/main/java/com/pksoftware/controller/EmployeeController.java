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
		EmployeeService employeeService;
		
		@GetMapping("/testing/{name}")
		public String check(@PathVariable String name) {
			   return "\n Your Input Name is the ::*********************************"+name;
		}
		
		
		@PostMapping("/staremployee")
		public Employee insert(@RequestBody Employee employee) {
			   Employee emp = employeeService.insert(employee);
			   return emp;
		}
		
		@PutMapping("/staremployee")
		public Employee update(@RequestBody Employee employee) {
			   Employee emp = employeeService.update(employee);
			   return emp;
		}
		
		@GetMapping("/staremployee")
		public List<Employee> getAll(){
			   List<Employee> list = employeeService.select();
			   return list;
		}
		
		@DeleteMapping("/staremployee/{id}")
		public String delete(@PathVariable int id) {
			   String message = employeeService.delete(id);
			   return message;
		}
		
		@GetMapping("staremployee/{id}")
		public Employee getById(@PathVariable int id) {
			   Employee emp = employeeService.getById(id);
			   return emp;
		}
}
