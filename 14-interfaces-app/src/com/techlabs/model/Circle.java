package com.techlabs.model;

public class Circle implements Shape {
	
	private int radius;
	
	
	
	public Circle(int radius) {
		super();
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}



	public void area() {
		System.out.println("Area is: "+(3.14*radius*radius));
		
	}



	@Override
	public void perimeter() {
		System.out.println("Perimeter of Circle is:"+(2*3.14*radius));
		System.out.println(FLAG);
	}

}
