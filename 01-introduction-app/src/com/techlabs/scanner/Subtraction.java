package com.techlabs.scanner;
import java.util.Scanner;
public class Subtraction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int n1=sc.nextInt();
		System.out.println("ENter second number:");
		int n2=sc.nextInt();
		
		int diff=n1-n2;
		System.out.println("subratction of\t" +n1+ "and" +n2+ "is" +diff);
		
		
				

	}

}
