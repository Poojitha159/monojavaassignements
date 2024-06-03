package com.techlabs.accountrefactoring;

public class Account {
	private int accountnumber;
	private String name;
	protected double balance;
	
	
	
	public Account(int accountnumber, String name, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
	}
	
	
	public int getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void credit(double amount) {
		balance+=amount;
		System.out.println("Amount credited.  new blanace :" +balance);
		
		
	}
	
	public void debit(double amount) {
		if(amount<balance) {
			balance-=amount;
			System.out.println("Amount debited .New balance:"+balance);
			
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	public void display() {
		System.out.println("Account Number"+accountnumber);
		System.out.println("Account Holder name"+name);
		System.out.println("Account Balance"+balance);
		
	}


	
}
