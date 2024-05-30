package com.techlabs.scanner;
import java.util.Scanner;

public class Swapingscan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int n1=sc.nextInt();
		System.out.println("ENter 2nd number:");
		int n2=sc.nextInt();
		System.out.println("Before swap"+n1 +n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swap"+n1 +n2);
	}

}
