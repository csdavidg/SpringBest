package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.exception.CustomerNotFoundException;
import com.luv2code.springdemo.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerRestController {

	@Autowired
	private CustomerService customerService;

	@GetMapping
	public List<Customer> getCustomers() {
		return this.customerService.getCustomers();
	}

	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
		Customer customer = this.customerService.getCustomer(customerId);
		if (customer == null) {
			throw new CustomerNotFoundException("The customer has not been found");
		}
		return customer;
	}

	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer) {
		customer.setId(0);
		this.customerService.saveCustomer(customer);
		return customer;
	}

	@PutMapping
	public Customer updateCustomer(@RequestBody Customer customer) {
		this.customerService.saveCustomer(customer);
		return customer;
	}

	@DeleteMapping
	public void deleteCustomer(@RequestBody Customer customer) {
		this.customerService.deleteCustomer(customer.getId());
	}
	
	@DeleteMapping("/{customerId}")
	public void deleteCustomerPathVariable(@PathVariable int customerId) {
		this.customerService.deleteCustomer(customerId);
	}
	
	@DeleteMapping("/deleteByid")
	public void deleteCustomerRequestParam(@RequestParam(name = "customerId") int customerId) {
		this.customerService.deleteCustomer(customerId);
	}

}
