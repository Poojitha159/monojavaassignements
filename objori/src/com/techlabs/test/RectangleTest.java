package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rectangle=new Rectangle();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Rectangle Details:");
		System.out.println("Enetr width");
		int width=scanner.nextInt();
		rectangle.setWidth(width);
		
		System.out.println("Enetr height");
		int height=scanner.nextInt();
		rectangle.setHeight(height);
		//rectangle.rectangleInitializing(width,height);
		rectangle.displayDetails();
		rectangle.areaOfRectangle();
	
		
		scanner.close();
	}

}
