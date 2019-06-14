package com.david.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.springboot.cruddemo.entity.Employee;
import com.david.springboot.cruddemo.service.EmployeeInterface;

@RestController
@RequestMapping("/employeesrest")
public class EmployeeRestController {

	@Autowired
	private EmployeeInterface employeeService;

	@GetMapping
	public List<Employee> getAll() {
		return employeeService.findAll();
	}

	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.findById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		employeeService.deleteById(id);
	}

}
