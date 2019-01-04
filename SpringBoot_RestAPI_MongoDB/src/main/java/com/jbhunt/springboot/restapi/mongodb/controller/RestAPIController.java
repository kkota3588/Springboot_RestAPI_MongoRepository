package com.jbhunt.springboot.restapi.mongodb.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbhunt.springboot.restapi.mongodb.beans.Customer;
import com.jbhunt.springboot.restapi.mongodb.repository.CustomerRepository;

@RestController
@RequestMapping(value = "/api")
public class RestAPIController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	private CustomerRepository customerRepository;

//	public RestAPIController(CustomerRepository customerRepository) {
//		this.customerRepository = customerRepository;
//	}

	@PostMapping(value = "/insert")
	public Customer addNewCustomer(@RequestBody Customer customer) {
		LOG.info("Saving user.");
		return customerRepository.save(customer);
	}

	@GetMapping(value = "/getAllCustomers")
	public List<Customer> getAllCustomers() {
		LOG.info("Getting all Customers.");
		return customerRepository.findAll();
	}

	@GetMapping(value = "/retrive/{customerId}")
	public Customer getCustomer(@PathVariable String customerId) {
		LOG.info("Getting user with ID: {}.", customerId);
		return customerRepository.findOne(customerId);
	}

	@GetMapping(value = "/deleteCustomerId/{customerId}")
	public Customer deleteCustomer(@PathVariable String customerId) {
		LOG.info("Getting user with ID: {}.", customerId);
		Customer customer = customerRepository.findOne(customerId);
		customerRepository.delete(customer);
		customer.setDescription("Successfully deleted");
		return customer;
	}

}
