package com.david.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.springboot.cruddemo.entity.Employee;

//@RepositoryRestResource(path = "members")
public interface EmployeeDAO extends JpaRepository<Employee, Long> {

}
