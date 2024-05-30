package com.techlabs.test;
import java.util.Scanner;

import com.techlabs.objori.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee=new Employee();
		//employee.displayEmployee();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr first employee Details");
		System.out.println("Enter the ID");
		int empId=scanner.nextInt();
		employee.setEmpId(empId);
		System.out.println("Enter the Name");
		String empName=scanner.next();
		employee.setEmpName(empName);
		System.out.println("Enter the salary");
		double empSalary=scanner.nextInt();
		employee.setEmpSalary(empSalary);
		//employee.empInitializing( empId, empName, empSalary);
		employee.displayEmployee();
		
		
		Employee employee2=new Employee();
		//Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr second employee Details");
		System.out.println("Enter the ID");
		 empId=scanner.nextInt();
		 employee2.setEmpId(empId);
		System.out.println("Enter the Name");
	    empName=scanner.next();
	    employee2.setEmpName(empName);

		System.out.println("Enter the salary");
	    empSalary=scanner.nextInt();
	    employee2.setEmpSalary(empSalary);
		//employee.empInitializing( empId, empName, empSalary);
		employee.displayEmployee();
		
				
		scanner.close();
	}

}
