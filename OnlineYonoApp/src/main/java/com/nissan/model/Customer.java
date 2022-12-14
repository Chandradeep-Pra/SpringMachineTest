package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers_tbl")
public class Customer {
	
	//Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	
	private long accountNumber;		
	private String name;
	private String accountType;	
	private double balance;
	private double minBalance = 1000;
	private long mobile;
	private String email;
	private int atmPin;				
	private boolean isActive = true;
	private String panNumber;
	
	//default constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Parameterized constructor
	public Customer(String name, String accountType, double balance, long mobile, String email,
			String panNumber) {
		super();
		this.name = name;
		this.accountType = accountType;
		this.balance = balance;
		this.mobile = mobile;
		this.email = email;
		this.panNumber = panNumber;
	}

	
	//getters and setters
	public int getCustId() {
		return custId;
	}

	

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAtmPin() {
		return atmPin;
	}

	public void setAtmPin(int atmPin) {
		this.atmPin = atmPin;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	
	//Override to string
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", accountNumber=" + accountNumber + ", name=" + name + ", accountType="
				+ accountType + ", balance=" + balance + ", minBalance=" + minBalance + ", mobile=" + mobile
				+ ", email=" + email + ", atmPin=" + atmPin + ", isActive=" + isActive + ", panNumber=" + panNumber
				+ "]";
	}
	
	
	
	
}
