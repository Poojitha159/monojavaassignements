package com.techlabs.checking;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("ENter number" );
		int n=scanner.nextInt();
		int rev=0,rem=0;
		
		for(;n!=0;)
		{
		    rem=n%10;
		    rev=rev*10+rem;
		    n=n/10;
		}
		System.out.println("reverse num is"+rev);	
		
		scanner.close();
	}
	
}
