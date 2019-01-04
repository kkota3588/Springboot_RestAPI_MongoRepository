package com.jbhunt.springboot.restapi.mongodb.repository;

import java.util.List;

import com.jbjunt.springboot.restapi.mongodb.beans.Customer;



public interface CustomerDAO {

	

	Customer getCustomerById(String CustomerId);

	Customer addNewCustomer(Customer Customer);
	List<Customer> getAllCustomers();

//	Object getAllCustomerSettings(String CustomerId);
//
//	String getCustomerSetting(String CustomerId, String key);
//
//	String addCustomerSetting(String CustomerId, String key, String value);
}
