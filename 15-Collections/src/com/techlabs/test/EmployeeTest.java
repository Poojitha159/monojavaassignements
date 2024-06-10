package com.techlabs.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.techlabs.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<Employee>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many employees need?");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enetr the id");
			int empId=sc.nextInt();
			
			System.out.println("Enetr name");
			String name=sc.next();
			
			System.out.println("Enetr salary");
			double salary=sc.nextDouble();
			
			employees.add(new Employee(empId,name,salary));
			//Employee employee=new Employee(empId,name,salary);
			
			//System.out.println(employee);
			
			//Employee employee=employees.get(2);
			//System.out.println(employees.get(2));
		
			
		}
		/*for(int i=0;i<employees.size();i++) {
			System.out.println(employees.get(i));
		}
		
		for(Employee employee:employees) {
			System.out.println(employees);
		}
		//System.out.println(employees);
		
		//System.out.println(employees.get(2));
		
		Iterator studentIterator=employees.listIterator();
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
			
		*/
		Iterator studentIterator=employees.iterator();
		while(studentIterator.hasNext()) {
			System.out.println(studentIterator.next());
		
	}
		for(Employee employee:employees) {
			System.out.println(employee);
		}

		ListIterator stuListIterator=(ListIterator) employees.iterator();
	}
}
