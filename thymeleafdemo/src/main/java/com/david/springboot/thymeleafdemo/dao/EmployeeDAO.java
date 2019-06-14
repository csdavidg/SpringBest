package com.david.springboot.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

}
