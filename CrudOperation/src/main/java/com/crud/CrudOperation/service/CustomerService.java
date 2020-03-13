package com.crud.CrudOperation.service;

import java.util.List;

import com.crud.CrudOperation.model.Customer;

public interface CustomerService {

	public List<Customer> getAllCustomer();
	 
	 public Customer getCustomerById(int id);
	 
	 public Customer addCustomer(Customer customer);
	 
	 public void updateCustomer(Customer customer);
	 
	 public void deleteCustomer(int id);
}
