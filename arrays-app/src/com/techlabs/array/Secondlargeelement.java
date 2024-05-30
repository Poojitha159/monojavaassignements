package com.techlabs.array;
import java.util.Scanner;


public class Secondlargeelement {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=scanner.nextInt();
		int array[]=new int[n]; 
		System.out.println("Enter values to array");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
		}
		System.out.println("Secondmax element of array is:");
		secondLargest(array,n);
		

		
	}
	public static int secondLargest(int[] array,int n) {
		int prev=0,cur=0;
		//int[] array;
		for(int i=0;i<n;i++) {
			if(array[i]>=cur) {
			prev=cur;
			cur=array[i];
			}
			//return cur;
		}//
		System.out.println(prev);
		return prev;
		
	}

}
