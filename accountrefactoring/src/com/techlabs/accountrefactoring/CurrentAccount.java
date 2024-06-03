package com.techlabs.accountrefactoring;

public class CurrentAccount  extends Account{
	
	private double overdraftLimit;
	
	public CurrentAccount(int accountnumber, String name, double balance,double overdraftLimit) {
		super(accountnumber, name, balance);
		this.overdraftLimit=overdraftLimit;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void debit(double amount) {
		if(amount<=getBalance()+overdraftLimit) {
			balance-=amount;
			System.out.println("Amount debited. New Balance."+balance);
			

		}
		else {
			System.out.println("Exceeded overdraftLimit");
		}
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("OverdreftLimit:"+overdraftLimit);
		
		
	}
	
	
	

}
