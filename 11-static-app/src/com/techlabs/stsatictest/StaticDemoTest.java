package com.techlabs.stsatictest;

import com.techlabs.model.StaticDemo;

public class StaticDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo.decrement();
		StaticDemo demo1=new StaticDemo();
		demo1.display();
		StaticDemo demo2=new StaticDemo();
		demo2.display();
		StaticDemo demo3=new StaticDemo();
		demo3.display();
				
		
		
		StaticDemo.decrement();
		
		demo1.increment();
		demo1.display();
		
		StaticDemo.decrement();

		
		demo2.increment();
		demo2.display();
		
		StaticDemo.decrement();

		
		demo3.increment();
		demo3.display();
		//hello();
		
	}
	
	//public void hello() {
		
	//}

	
	static {
		System.out.println("Main class  loaded");
	}
}
