package com.techlabs.array;
import java.util.Scanner;

public class MaxofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of array");
		int arr_size=0;
		if(scanner.hasNextInt()) {
			arr_size=scanner.nextInt();
		}
		int array[]=new int[arr_size];
		int max=array[0];
		System.out.println("enter values to array");
		for(int i=0;i<array.length;i++) {
			array[i]=scanner.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
			
		}System.out.println("Max element  is:"+max);

	}

}
