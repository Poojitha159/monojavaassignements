package com.techlabs.month;
import  java.util.Scanner;
public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the date: ");
		int date=scanner.nextInt();
		switch(date) {
		case 1:
			System.out.println("This is Sunday");
			break;
		case 2:
			System.out.println("This is Monday");
			break;
		case 3:
			System.out.println("This is Tuesday");
			break;
		case 4:
			System.out.println("This is Wednesday");
			break;
		case 5:
			System.out.println("This is Thursday");
			break;
		case 6:
			System.out.println("This is Friday");
			break;
		case 7:
			System.out.println("This is Saturday");
			break;

	}
		scanner.close();

}

}