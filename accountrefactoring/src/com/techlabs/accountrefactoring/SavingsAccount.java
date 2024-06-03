package com.techlabs.accountrefactoring;

public class SavingsAccount extends Account {
	private double minBalance;

	public SavingsAccount(int accountnumber, String name, double balance, double minBalance) {
		super(accountnumber, name, balance);
		this.minBalance = minBalance;
	}
	
	
	@Override
	public void debit(double amount) {
		if(balance-amount>=minBalance) {
			balance-=amount;
			System.out.println("Amount debited. New balance:" + balance);
		        
			
		}
		else {
            System.out.println("Cannot debit amount. Minimum balance requirement not met.");
        }
	}
	@Override
    public void display() {
        super.display();
        System.out.println("Minimum Balance: " + minBalance);
    }

}
