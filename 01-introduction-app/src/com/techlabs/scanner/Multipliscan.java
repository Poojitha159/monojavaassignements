package com.techlabs.scanner;
import java.util.Scanner;
public class Multipliscan {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st input");
	int n1=sc.nextInt();
	System.out.println("enter 2nd input:");
	int n2=sc.nextInt();
	
	int mul=n1*n2;
	System.out.println("MUl results is"+mul);
	}

}
