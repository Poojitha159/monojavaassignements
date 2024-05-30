package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.objori.Student;

public class StudentTest {

	public static void main(String[] args) {
		Student student1=new Student();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter student1 details");
		
		System.out.println("Enetr rollnumbetr: ");
		int rollnumber=scanner.nextInt();
		student1.setRollnumber(rollnumber);
		
		
		System.out.println("Enetr name");
		String name=scanner.next();
		student1.setName(name);
		
		System.out.println("Enetr the age: ");
		int age=scanner.nextInt();
		student1.setAge(age);
		
		student1.displayStudent();
		
		
		
		
		Student student2=new Student();
         System.out.println("Enter student2 details");
		
		System.out.println("Enetr rollnumbetr: ");
	    rollnumber=scanner.nextInt();
		student2.setRollnumber(rollnumber);
		
		
		System.out.println("Enetr name");
	    name=scanner.next();
		student2.setName(name);
		
		System.out.println("Enetr the age: ");
		 age=scanner.nextInt();
		student2.setAge(age);
		
		
		student1.displayStudent();
		
		scanner.close();
	}
  
}
