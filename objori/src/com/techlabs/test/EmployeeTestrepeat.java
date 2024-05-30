package com.techlabs.test;
import java.util.Scanner;
import com.techlabs.objori.Employee;

public class EmployeeTestrepeat {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		Employee emp=new Employee();
		System.out.println("Enter employee details:");
		System.out.println("Enter ID:");
		int empId=scanner.nextInt();
		emp.setEmpId(empId);
		System.out.println("Enter Name:");
		String name=scanner.next();
		emp.setEmpName(name);
		System.out.println("Enter Salary:");
		double salary=scanner.nextInt();
		emp.setEmpSalary(salary);
		
		System.out.println("("+emp.getEmpId()+","+emp.getName()+","+emp.getEmpSalary()+")");
		
		
		Employee emp2=new Employee(2,"harshini",20000.0);
		System.out.println("emp2 details");
		System.out.println("("+emp2.getEmpId()+","+emp2.getName()+","+emp2.getEmpSalary()+")");
		
		
	}

	

}
