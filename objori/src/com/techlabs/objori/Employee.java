package com.techlabs.objori;

public class Employee {
	
	private int empId;
	private String empName;
	private double empSalary;
	
	public Employee()
	{
		int empId=0;
		String empName="";
		double empSalary=0;
	}
	
	
	public Employee(int i, String string, double d) {
		empId=i;
		 empName=string;
		 empSalary=d;
		// TODO Auto-generated constructor stub
	}
	public void setEmpId(int empId1) {
		empId=empId1;
		
	}
	public int getEmpId()
	{
		return empId;
	}
	
	
	public void setEmpName(String empName1) {
		empName=empName1;
	}
	public String getName()
	{
		return empName;
		
	}
	
	public void setEmpSalary(double empSalary1) {
		 empSalary=empSalary1;
		
	}
	public double getEmpSalary()
	{
		return empSalary;
	}
	
	/*public void empInitializing(int empId1,String empName1,double empSalary1)
	{
		empId=empId1;
		empName=empName1;
		empSalary=empSalary1;
		
	}*/
	 public void displayEmployee()
	 {
		 System.out.println("Employee Id:"+empId);
			System.out.println("EMployee Name :"+empName);
			System.out.println("EMployee Salary:"+empSalary);

	 }

}
