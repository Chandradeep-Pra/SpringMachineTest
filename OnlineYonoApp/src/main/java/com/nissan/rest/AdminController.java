package com.nissan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Customer;
import com.nissan.service.IAdminService;

@CrossOrigin
@RestController
@RequestMapping("api/admin/")
public class AdminController {
	
	//Field dependency injection
	@Autowired
	IAdminService adminService;
	
	//Show all Customers
	@RequestMapping("allCustomer")
	public List<Customer> getAllCustomers(){
		return adminService.getAllCustomers();
	}
	
	
	// Adding  Customer 
	@PostMapping("addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return adminService.addCustomer(customer);
	}
	
	//Update Customer
	@PutMapping("updateCustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return adminService.editCustomer(customer);
	}
	
	
	//Deleting  Customer
	@RequestMapping("deleteCustomer/{accNum}")
	public Customer deleteCustomer(@PathVariable long accNum) {
		return adminService.deleteCustomer(accNum);
	}
	
	
	//Searching customer by account number
	@RequestMapping("searchCustomer/{accNum}")
	public Customer searchCustomer(@PathVariable long accNum) {
		return adminService.findCustomerByAccountNumber(accNum);
	}
	
}
