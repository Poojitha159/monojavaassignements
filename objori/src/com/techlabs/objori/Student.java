package com.techlabs.objori;

public class Student {
	
	private int rollnumber;
	private String name;
	private int age;
	
	
	public void setRollnumber(int rollnumber1)
	{
		rollnumber=rollnumber1;
	}
	
	public int getRollnumber()
	{
		return rollnumber;
	}
	
	public void setName(String name1) {
		name=name1;
	}
	
	public String setName()
	{
		return name;
	}
	
	public void setAge(int age1) {
		age=age1;
		
	}
	
	public int setAge()
	{
		return age;
	}
	
	public void displayStudent()
	{
		
		System.out.println("Roll Number"+rollnumber);
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);


	}

}
