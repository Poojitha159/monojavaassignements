package com.techlabs.enums;

import java.util.Scanner;

public class AccountTestEnum {

	public static void main(String[] args) {
			
		
		Account account[]=new Account[3];
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<account.length;i++) {
			
			account[i]=new Account();
			System.out.println("Enter Account Number:");
			account[i].setAccountNumber(scanner.nextInt());
			
			System.out.println("Enetr Name:");
			account[i].setName(scanner.next());
			
			System.out.println("Enter Balance");
			account[i].setBalance(scanner.nextDouble());
			
			System.out.println("Enter AccountType !! for savings press 1, for current press 2");
			int accountType=scanner.nextInt();
			if(accountType==1) {
				account[i].setAccountType(AccountTpe.savings);
				
			}
			if(accountType==2) {
				account[i].setAccountType(AccountTpe.current);
				
			}
			
			
		}
		for(int i=0;i<account.length;i++) {
			System.out.println(account[i]);
			System.out.println("");
		}
		
		for(Account acc:account) {
			System.out.println(acc);
		}
		
		}

}
