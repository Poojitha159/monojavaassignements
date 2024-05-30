package com.techlabs.checking;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int x=scanner.nextInt();
		if(isPrime(x)) {
			System.out.println(x+ "is aprime number");
			
		}
		else {
			System.out.println(x+ "is not aprime number");
		}
		
		scanner.close();

		// TODO Auto-generated method stub

	}
	public static boolean isPrime(int x){
		   if(x<=1) {
			   return false;
		   }
		   for(int i=2;i<=Math.sqrt(i);i++) {
			   if(x%i==0)
				   return false;
			  
			   
		   }
		   

	    return true;	
	    }

}
