package com.techlabs.model;

public class Rectangle {
	private int width;
	private int  height;
	
	public void setHeight(int height1) {
		height=height1;
	}
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int width1) {
		width=width1;
	}
	public int getWidth() {
		return width;
	}

	
	
	  /*public void rectangleInitializing(int width1,int height1) {
		  width=width1;
		  height=height1;
		  
	  }*/
	  public void displayDetails()
	  {
		  System.out.println("width is: "+width);
		  System.out.println("Height is: "+height);
		  
	  }
	  public void areaOfRectangle() {
		  int area=width*height;
		  System.out.println("Area of rectangle is:"+area);
	  }
}
