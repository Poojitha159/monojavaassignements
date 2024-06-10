package com.techlabs.test;

import com.techlabs.model.Circle;
import com.techlabs.model.Rectangle;
import com.techlabs.model.Shape;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape;
		
		Circle circle=new Circle(5);
		circle.area();
		circle.perimeter();
		
		Rectangle rectangle=new Rectangle(2,3);
		rectangle.area();
		rectangle.perimeter();
		
		shape=new Circle(5);
		shape.area();
		shape.perimeter();
		
		

	}

}
