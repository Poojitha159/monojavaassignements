package com.techlabs.model;

import java.util.Scanner;

public class MaxFact {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter num1");
		int n1=scanner.nextInt();
		
		System.out.println("enter num2");
		int n2=scanner.nextInt();
		
		int m=max(n1,n2);
		System.out.println(m);
		
		System.out.println("Enetr a num");
		System.out.println("enter n");
		int n=scanner.nextInt();
        int f=fact(n);
		System.out.println(f);

		/*int fact=1;
		if(n==0) {
			System.out.println("Values is 0");
			
		}
        if(n<0) {
        	System.out.println("can't find fact");
        	
        
        }
       // retrun -1;
        for(int i=0;i<n;i++) {
        	fact=fact*1;
        }return 1;*/
		

	}

	private static int fact(int n) {
		// TODO Auto-generated method stub
		
		int fact=1;
		if(n==0) {
			System.out.println("Values is 0");
			
		}
        if(n<0) {
        	System.out.println("can't find fact");
        	
        
        }
       // retrun -1;
        for(int i=1;i<=n;i++) {
        	
        	fact=fact*i;
        }return 1;
		

	}

	private static int max(int n1, int n2) {
		// TODO Auto-generated method stub
		if(n1>n2) {
			return n1;
		}
		return n2;
	}

}
