package com.david.springboot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.david.springboot.thymeleafdemo.entity.Employee;
import com.david.springboot.thymeleafdemo.service.EmployeeInterface;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeInterface employeeService;

	@GetMapping("/employessList")
	public String listEmployees(Model model) {
		List<Employee> employeesList = employeeService.findAll();
		model.addAttribute("employeesList", employeesList);
		return "list-employees";
	}

}
