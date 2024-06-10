package com.techlabs.taslaccount;

public class AccountTesttask {

	public static void main(String[] args) {

		SavingsAccount savingAccount=new SavingsAccount("12345","Poojitha",5000);
		System.out.println(savingAccount);
		
		savingAccount.credit(4000);
		savingAccount.debit(4500);
		System.out.println(savingAccount);
		
		System.out.println();
		SavingsAccount savingsAccount = new SavingsAccount("102", "Harshini", 5000);
        savingsAccount.credit(2000);
        savingsAccount.debit(1500); 
        savingsAccount.debit(800); 
        System.out.println(savingsAccount);
	}

}