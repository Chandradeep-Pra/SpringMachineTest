package com.nissan.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.service.ICustomerService;

@CrossOrigin
@RestController
@RequestMapping("api/customer/")
public class CustomerController {

	//feild di injection
	ICustomerService custService;
	
	
	//Depositing Money into Customer Account
	@RequestMapping("/deposite/{accountNumber}&&{money}")
	String depositeMoney(@PathVariable long accountNumber, @PathVariable double money) {
		return custService.depositeMoney(accountNumber, money);
	}
	
	//Withdraw Money from Customer Account
	@RequestMapping("/withdraw/{accountNumber}&&{money}")
	String withdrawMoney(@PathVariable long accountNumber, @PathVariable double money) {
		return custService.withdrawMoney(accountNumber, money);
	}
	
	//Show Balance of a Customer
	@RequestMapping("/balance/{accountNumber}&&{money}")
	String showBalance(@PathVariable long accountNumber) {
		return custService.showBalance(accountNumber);
	}
	
	
	//Transferring Money from One Account to Another account
	@RequestMapping("/transfer/{senderAccountNumber}&&{receiverAccountNumber}&&{money}")
	String transferMoney(@PathVariable long senderAccountNumber, @PathVariable long receiverAccountNumber, @PathVariable double money) {
		return custService.transferMoney(senderAccountNumber, receiverAccountNumber, money);
	}
}
