package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nissan.model.Customer;
import com.nissan.repository.ICustomerRepository;

@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	ICustomerRepository custRepo;

	

	// Adding a new customer
	@Transactional
	@Override
	public Customer addCustomer(Customer customer) {
		long accountNumber = this.accountNumberGenerator();
		customer.setAccountNumber(accountNumber);
		int atmPin = this.atmPinGenerator();
		customer.setAtmPin(atmPin);
		return custRepo.save(customer);
	}
	
	// show all customer
		@Override
		public List<Customer> getAllCustomers() {
			return (List<Customer>) custRepo.findAll();
		}
		
	// Updating Customer details
	@Transactional
	@Override
	public Customer editCustomer(Customer customer) {
		return custRepo.save(customer);
	}

	// Deleting Customer
	@Transactional
	@Override
	public Customer deleteCustomer(long accountNumber) {
		Customer customer = this.findCustomerByAccountNumber(accountNumber);
		customer.setActive(false);
		return custRepo.save(customer);
	}

	// Searching customer by account number
	@Override
	public Customer findCustomerByAccountNumber(long accountNumber) {
		Customer customer = this.findCustomerByAccountNumber(accountNumber);
		return customer;
	}

	// Method to generate random 9 digit number for account number
	private long accountNumberGenerator() {
		return (long) (Math.random() * (999999999 - 100000000 + 1) + 100000000);
	}

	// Method to generate random 4 digit number for atm pin
	private int atmPinGenerator() {
		return (int) (Math.random() * (9999 - 1000 + 1) + 1000);
	}

}
