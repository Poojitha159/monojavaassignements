package com.techlabs.scanner;
import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first input");
		int n1=sc.nextInt();
		System.out.println("Enter secondinput");
		int n2=sc.nextInt();
		
		int sum=n1+n2;
		System.out.println("sum is"+sum);
		
		
	}

}
