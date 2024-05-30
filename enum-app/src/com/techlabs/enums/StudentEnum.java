package com.techlabs.enums;

public class StudentEnum {
	private int rollnumber;
	private String name;
	private int age;
	private String emailId;
	
	
	
	
	public StudentEnum() {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.age = age;
		this.emailId = emailId;
	}
	
	
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return " rollnumber=" + rollnumber + ", name=" + name + ", age=" + age + ", emailId=" + emailId
				+ "";
	}
	
	

	
	
}
