package com.jbjunt.springboot.restapi.mongodb.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer {
	@Id
	private String customerId;
	private String customerName;
	private String department;
	private String salary;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	private String description;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomeName() {
		return customerName;
	}

	public void setCustomeName(String customerName) {
		this.customerName = customerName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [customerId=" + customerId + ", customerName=" + customerName + ", department=" + department
				+ ", salary=" + salary + ",description=" + description + "]";
	}
}
