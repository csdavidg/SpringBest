package com.david.springdemo.dao;

import java.util.List;

import com.david.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(Long customerId);

	public void deleteCustomer(Long customerId);

}
