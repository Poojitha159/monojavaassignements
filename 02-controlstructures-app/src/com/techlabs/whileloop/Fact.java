package com.techlabs.whileloop;
import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int f=1;
         int x=1;
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         while(x<=n) {
        	 f=f*x;
        	 x++;
        	 
         }
         System.out.println("FActorial"+f);
         sc.close();
	}
     
}
