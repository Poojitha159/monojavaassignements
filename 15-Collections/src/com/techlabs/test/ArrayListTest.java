package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		list.add("P");
		list.add(new Integer(82));
		list.add("H");  
        System.out.println(list);
		
		list.remove(1);
		
		 System.out.println(list);
		 
		Object poojitha=20;
		// list.addAll(c);
		 list.add(1, poojitha);
		 System.out.println(list);
		 //Object poojitha;
	//	list.add(index, element);

	}

}
