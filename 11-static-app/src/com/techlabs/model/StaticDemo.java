package com.techlabs.model;

public class StaticDemo {
	private int n1;
	private static  int n2;
	
	
	public StaticDemo()
	{
		n1=0;
		n2=0;
		
	}
	public void increment() {
		n1++;
		n2++;
		
	}
	
	public void display() {
		
		System.out.println("number 1:"+n1);
		System.out.println("number 2:"+n2);
	}

}
