package com.crud.CrudOperation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.crud.CrudOperation.model.Customer;

@Component
public class CustomerServiceImpl implements CustomerService {

	private static List<Customer> customers = new ArrayList<>();

	static {
		Customer cust1 = new Customer(1, "Sandeep 1", "admin@jmail.com", "This is a Sandeep 1");
		Customer cust2 = new Customer(2, "Rahul 2", "support@jmail.com", "This is a rahul 2");
		Customer cust3 = new Customer(3, "pulkit 3", "test@jmail.com", "This is a pulkit 3");

		customers.add(cust1);
		customers.add(cust2);
		customers.add(cust3);
	}

	@Override
	public List<Customer> getAllCustomer() {
		return customers;
	}

	@Override
	public Customer getCustomerById(int id) {
		for (Customer customer : customers) {
			if (customer.getId() == id) {
				return customer;
			}
		}
		return null;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		Random random = new Random();
		int nextId = random.nextInt(1000) + 10;

		customer.setId(nextId);
		customers.add(customer);

		return customer;
	}

	@Override
	public void updateCustomer(Customer customer) {
		for (Customer oldCustomer : customers) {
			if (oldCustomer.getId() == customer.getId()) {
				oldCustomer.setName(customer.getName());
				oldCustomer.setEmail(customer.getEmail());
				oldCustomer.setDescription(customer.getDescription());
			}
		}
	}

	@Override
	public void deleteCustomer(int id) {
		for (Customer c : customers) {
			if (c.getId() == id) {
				customers.remove(c);
				break;
			}
		}
	}
}
