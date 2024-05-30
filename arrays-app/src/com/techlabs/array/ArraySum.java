package com.techlabs.array;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		//  Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr_size=0;
		if(sc.hasNextInt()) {
			arr_size=sc.nextInt();
		}
		int array[]=new int[arr_size];
		int sum=0;
		System.out.println("enter values to array");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
			
		}
		System.out.println("Sum of elements is:"+sum);
		

	}

}
