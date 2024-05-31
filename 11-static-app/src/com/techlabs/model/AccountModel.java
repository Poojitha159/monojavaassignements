package com.techlabs.model;

public class AccountModel {
	private int accountNumber;
	private String name;
	private double balance;
	private static int accountCount=0;
	
	
	public AccountModel(int accountNumber,String name,double balance)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
		
		accountCount++;
		System.out.println("Account" +accountCount+" is created");
		
	}
	
	public void display() {
		System.out.println("Account number is:"+accountNumber);
		System.out.println("Name is :"+name);
		System.out.println("balance is :" +balance);
		
		
	}
	
	public static int getAccountCount() {
		
		return accountCount;
	}
     
}
