package com.techlabs.enums;

public class EnumTest {

	public static void main(String[] args) {
		
		//String str = "MONDAY";
        EnumExample t1 = new EnumExample(Day.valueOf("MONDAY"));
        t1.dayIsLike();
       //Day c1 = Day.MONDAY;
        //System.out.println(c1);
	}

}
