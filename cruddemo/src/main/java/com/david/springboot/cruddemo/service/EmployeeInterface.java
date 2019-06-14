package com.david.springboot.cruddemo.service;

import java.util.List;

import com.david.springboot.cruddemo.entity.Employee;

public interface EmployeeInterface {

	public List<Employee> findAll();

	public Employee save(Employee employee);

	public Employee findById(Long id);

	public void deleteById(Long id);

}
