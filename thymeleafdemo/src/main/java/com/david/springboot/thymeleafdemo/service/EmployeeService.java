package com.david.springboot.thymeleafdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.springboot.thymeleafdemo.dao.EmployeeDAO;
import com.david.springboot.thymeleafdemo.entity.Employee;

@Service
public class EmployeeService implements EmployeeInterface {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	public List<Employee> findAll() {
		return (List<Employee>) employeeDAO.findAll();
	}

	@Transactional
	public Employee save(Employee employee) {
		return employeeDAO.save(employee);
	}

	@Transactional
	public Employee findById(Long id) {
		return employeeDAO.findById(id).orElse(null);
	}

	@Transactional
	public void deleteById(Long id) {
		employeeDAO.deleteById(id);
	}

}
