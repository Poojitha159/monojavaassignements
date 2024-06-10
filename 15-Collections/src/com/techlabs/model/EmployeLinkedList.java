package com.techlabs.model;

public class EmployeLinkedList{
	
	private int empId;
	private String name;
	private double salary;
	
	
	
	public EmployeLinkedList(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "empId=" + empId + ", name=" + name + ", salary=" + salary ;
	}


	
}
