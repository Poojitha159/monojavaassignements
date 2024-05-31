package com.techlabs.test;

import com.techlabs.model.BoxWeight;

public class BoxWeightTest {

	public static void main(String[] args) {
		
		BoxWeight boxweight=new BoxWeight();
		
		boxweight.setHeight(20);
		boxweight.setDepth(10);
		boxweight.setWidth(5);
		boxweight.setWeight(100);
		boxweight.setRange(35);
		System.out.println(boxweight.getDepth());
		System.out.println(boxweight.getHeight());
		System.out.println(boxweight.getWidth());
		System.out.println(boxweight.getWeight());
		System.out.println(boxweight.getRange());
		
		
		
	}

}
