package com.techlabs.test;

import java.util.LinkedList;
import java.util.Scanner;

import com.techlabs.model.EmployeLinkedList;

public class EmployeLinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<EmployeLinkedList> llist=new LinkedList<EmployeLinkedList>();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("How many employees need?");
		int n=scanner.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enetr the id");
			int empId=scanner.nextInt();
			
			System.out.println("Enetr name");
			String name=scanner.next();
			
			System.out.println("Enetr salary");
			double salary=scanner.nextDouble();

		
		llist.add(new EmployeLinkedList(empId,  name,  salary));
		
				}
		
		for(EmployeLinkedList l:llist) {
			System.out.println(l);
		}
	}

}
