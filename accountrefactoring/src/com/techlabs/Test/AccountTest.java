package com.techlabs.Test;

import java.util.Scanner;

import com.techlabs.accountrefactoring.Account;
import com.techlabs.accountrefactoring.CurrentAccount;
import com.techlabs.accountrefactoring.SavingsAccount;

public class AccountTest {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = null;
        while (true) {
            System.out.println("Select Account Type :");
            System.out.println("1. Savings");
            System.out.println("2. Current");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice: ");
            
            int accountTypeChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline


            
            switch (accountTypeChoice) {
            case 1:
                System.out.println("You chose Savings Account.");
                while (true) {
                    System.out.println("Select Operation :");
                    System.out.println("1. Create Account");
                    System.out.println("2. Display Account Details");
                    System.out.println("3. Credit into Account");
                    System.out.println("4. Debit from Account");
                    System.out.println("5. Exit");
                    System.out.print("Enter Your Choice: ");
                    
                    int operationChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    
                    
                    if (operationChoice == 1) {
                        System.out.println("You selected creating new account");
                        
                        System.out.print("Enter Account Number: ");
                        int accountnumber = scanner.nextInt();
                        System.out.println(accountnumber);
                        
                        System.out.print("Enter Account Holder Name: ");
                        String name = scanner.nextLine();
                        System.out.println(name);
                        
                        System.out.print("Enter Opening Balance: ");
                        double balance = scanner.nextDouble();
                        System.out.println(balance);
                        
                        System.out.print("Enter Minimum Balance: ");
                        double minBalance = scanner.nextDouble();
                        System.out.println(minBalance);
                        scanner.nextLine(); // Consume newline

                        account = new SavingsAccount(accountnumber, name, balance, minBalance);
                        System.out.println("Your Account is created.");
                    } 
                    else if (operationChoice == 2 && account != null) {
                        account.display();
                    }
                    else if (operationChoice == 3 && account != null) {
                        System.out.print("Enter Amount to credit: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        account.credit(amount);
                    } 
                    else if (operationChoice == 4 && account != null) {
                        System.out.print("Enter Amount to debit: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        account.debit(amount);
                    } 
                    else if (operationChoice == 5) {
                        break;
                    } 
                    else {
                        System.out.println("Invalid choice or account not created yet.");
                    }
                }
                break;
            case 2:
                System.out.println("You chose Current Account.");
                while (true) {
                    System.out.println("Select Operation :");
                    System.out.println("1. Create Account");
                    System.out.println("2. Display Account Details");
                    System.out.println("3. Credit into Account");
                    System.out.println("4. Debit from Account");
                    System.out.println("5. Exit");
                    System.out.print("Enter Your Choice: ");
                    int operationChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (operationChoice == 1) {
                        System.out.println("You selected creating new account");
                        
                        System.out.print("Enter Account Number: ");
                        int accountnumber = scanner.nextInt();
                        System.out.println(accountnumber);
                        
                        System.out.print("Enter Account Holder Name: ");
                        String name = scanner.nextLine();
                        System.out.println(name);
                        
                        System.out.print("Enter Opening Balance: ");
                        double balance = scanner.nextDouble();
                        System.out.println(balance);
                        
                        System.out.print("Enter Overdraft Limit: ");
                        double overdraftLimit = scanner.nextDouble();
                        System.out.println(overdraftLimit);
                        
                        scanner.nextLine(); // Consume newline

                        account = new CurrentAccount(accountnumber, name, balance, overdraftLimit);
                        System.out.println("Your Account is created.");
                    } 
                    else if (operationChoice == 2 && account != null) {
                        account.display();
                    }
                    else if (operationChoice == 3 && account != null) {
                        System.out.print("Enter Amount to credit: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        account.credit(amount);
                    }
                    else if (operationChoice == 4 && account != null) {
                        System.out.print("Enter Amount to debit: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        account.debit(amount);
                    }
                    else if (operationChoice == 5) {
                        break;
                    }
                    else {
                        System.out.println("Invalid choice or account not created yet.");
                    }
                }
                break;
            case 3:
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}





}