package com.techlabs.checking;
import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scanner=new Scanner(System.in);
         int sum=0;
         int n=scanner.nextInt();
         while(n!=0) {
        	 sum=sum+n%10;
        	 n=n/10;
        	 
        	 
         }
         System.out.println("sum of digitd is: "+sum);
	}

}
