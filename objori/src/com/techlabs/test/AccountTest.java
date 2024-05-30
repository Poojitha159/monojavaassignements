package com.techlabs.test;
import java.util.Scanner;

import com.techlabs.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account=new Account();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First Account holder Details:");
		System.out.println("Enter Account Number");
	    String accountNumber=scanner.next();
	    account.setAccountNumber(accountNumber);
		System.out.println("Enter Account Type");
		String accountType=scanner.next();
		account.setAccountType(accountType);
		System.out.println("Enetr Account holder name");
		String name=scanner.next();
		account.setName(name);
		System.out.println("Enter the balance");
		double balance=scanner.nextDouble();
		account.setBalance(balance);
		//account.accountInitializing(accountNumber,accountType,name,balance);
		account.displayAccountDetails();
		
		Account account2=new Account();
		//account2.displayAccountDetails();
		System.out.println("Enter Second Account holder Details:");
		System.out.println("Enter Account Number");
	    accountNumber=scanner.next();
	    account2.setAccountNumber(accountNumber);
		System.out.println("Enter Account Type");
		accountType=scanner.next();
		account2.setAccountType(accountType);
		System.out.println("Enetr Account holder name");
	    name=scanner.next();
	    account2.setName(name);;
		System.out.println("Enter the balance");
	    balance=scanner.nextDouble();
	    account2.setBalance(balance);
	    //account2.accountInitializing(accountNumber,accountType,name,balance);
	    account2.displayAccountDetails();
		
		scanner.close();
	}

}
