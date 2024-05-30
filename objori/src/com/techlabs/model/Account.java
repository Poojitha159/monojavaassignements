package com.techlabs.model;

public class Account {
	
	
	private String accountNumber;
	private String accountType;
	private String name;
	private double balance;
	
	public void setAccountNumber(String accountNumber1)
	{
		accountNumber=accountNumber1;
		
	}
	public String getaccountNumber() {
		return accountNumber;
	}
   
	
	public void setAccountType(String accountType1) {
		accountType=accountType1;
	}
	 public String getaccountTypr()
	 { return accountType;
	 
	 }
	 
	 public void setName(String name1)
	 {
		 name=name1;
	 }
	 public String getName() {
		 return name;
	 }
	 
	 public void setBalance(double balance1) {
		 balance=balance1;
	 }
	 public double getBalance()
	 {
		 return balance;
	 }
	 
	 
	public void displayAccountDetails()
	{
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Type:  : "+accountType);
		System.out.println("Name : "+name);
		System.out.println("Account balance : "+balance);
		
	}
}
