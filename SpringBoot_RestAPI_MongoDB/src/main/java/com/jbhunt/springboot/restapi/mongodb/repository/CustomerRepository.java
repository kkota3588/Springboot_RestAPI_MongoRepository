package com.jbhunt.springboot.restapi.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jbjunt.springboot.restapi.mongodb.beans.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
}
