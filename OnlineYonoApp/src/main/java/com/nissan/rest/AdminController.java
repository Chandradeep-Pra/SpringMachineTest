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
	
	//field dependency injection
	@Autowired
	IAdminService adminService;
	
	//show all Customers
	@RequestMapping("allcustomers")
	public List<Customer> getAllCustomers(){
		return adminService.getAllCustomers();
	}
	
	
	// add  Customer
	@PostMapping("addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return adminService.addCustomer(customer);
	}
	
	//update Customer
	@PutMapping("/")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return adminService.editCustomer(customer);
	}
	
	
	//delete Customer
	@RequestMapping("delete/{accNum}")
	public Customer deleteCustomer(@PathVariable long accNum) {
		return adminService.deleteCustomer(accNum);
	}
	
	
	//search by account number
	@RequestMapping("search/{accNum}")
	public Customer searchCustomer(@PathVariable long accNum) {
		return adminService.findCustomerByAccountNumber(accNum);
	}
	
}
