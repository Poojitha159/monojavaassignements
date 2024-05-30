package com.techlabs.tokens;

public class swaping {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println( "after swap"+a + ""+b);
		//without
		int n=10;
		int m=20;
		n=n+m;
		m=n-m;
		n=n-m;
		System.out.println("swap without"+n +""+m);

         
	}

}
