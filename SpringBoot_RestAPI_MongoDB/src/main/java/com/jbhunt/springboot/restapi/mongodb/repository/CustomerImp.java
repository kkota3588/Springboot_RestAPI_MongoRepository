package com.jbhunt.springboot.restapi.mongodb.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.jbhunt.springboot.restapi.mongodb.beans.Customer;

@Repository
public class CustomerImp implements CustomerDAO {
	@Autowired
	private MongoTemplate mongoTemplate;

	public List<Customer> getAllCustomers() {
		return mongoTemplate.findAll(Customer.class);
	}

	public Customer getCustomerById(String customerId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("userId").is(customerId));
		return mongoTemplate.findOne(query, Customer.class);
	}

	public Customer addNewCustomer(Customer customer) {
		mongoTemplate.save(customer);
		// Now, user object will contain the ID as well
		return customer;
	}

}
