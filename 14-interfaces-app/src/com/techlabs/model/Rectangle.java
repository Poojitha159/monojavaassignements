package com.techlabs.model;

public class Rectangle implements Shape{

	private int length;
	private int width;
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public void area() {
		System.out.println("Area of rectangle is "+(length*width));
	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of rectangle is "+(length+width)*2);
		
	}
	
}
