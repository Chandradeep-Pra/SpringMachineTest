package com.nissan.service;

import java.util.List;

import com.nissan.model.Customer;

public interface IAdminService {

	// Add customer
	Customer addCustomer(Customer customer);
	
	// Edit customer
	Customer editCustomer(Customer customer);
	
	//Deleting customer
	Customer deleteCustomer(long accNum);
		
	//Displaying all customer
	List<Customer> getAllCustomers();
		
	//Search customer by account number
	Customer findCustomerByAccountNumber(long accNum);
}
