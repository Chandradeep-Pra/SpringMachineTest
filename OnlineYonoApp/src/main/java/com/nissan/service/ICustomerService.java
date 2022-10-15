package com.nissan.service;

import com.nissan.model.Customer;

public interface ICustomerService {
	
	//Money Deposit
	String depositeMoney(long accountNumber,double money);
	
	//Money withdraw
	String withdrawMoney(long accountNumber,double money);
	
	//Show Balance 
	String showBalance(long accountNumber);
	
	//Money Transfer
	String transferMoney(long senderAccountNumber, long receiverAccountNumber, double money);
}
