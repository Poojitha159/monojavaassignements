package com.techlabs.cla;

public class Swaspofnums {

	public static void main(String[] args) {
		//with out variable
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		System.out.println("before swapping of " +n1+ "and" +n2   +n1+ +n2);
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("After swapping " +n1 +n2);
		//using third variable
		int t;
		t=n1;
		n1=n2;
		n2=t;
		System.out.println("with variable"+n1 +n2);
	}

}
