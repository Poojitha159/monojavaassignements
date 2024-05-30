package com.techlans.typecasting;

public class Test {

	public static void main(String[] args) {
		double num=100.5;
		double n=num;
		//int num1=num;//gives error
		//int n1=num1;//implicit conversion //widening expression
		
		double x=34.5;
		int x1=(int)x; //explicit typecasting //narrowing expression
		  
		boolean flag=true;
		
		//int flag1=flag; //wont support
		
		//int flag=(int)flag;
		
		byte n2=7;
		byte n3=8;
		byte mul=(byte)(n2*n3);
		
		float f=17.7f;
		int f1=(int)f;
		System.out.println(n);
		System.out.println(num);
		System.out.println(x1);
		System.out.println(f);
	}

}
