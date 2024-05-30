package com.techlabs.checking;

import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int r,sum=0,temp;
		int n=scanner.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
		    n=n/10;
        	
        }
		if(temp==sum)
			System.out.println("It is palindrome");
		else
			System.out.println("It is not palindrome");
        scanner.close();
        
        
        
        
	}

}
