package com.techlabs.array;
import java.util.Scanner;
public class Test2D { ///Addition of 2 arrays

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the rows");
		int m=scanner.nextInt();
		System.out.println("Enter the columns");
		int n=scanner.nextInt();
		int a[][]=new int[m][n];
	    int b[][]=new int[m][n];
	    int c[][]=new int[m][n];;
		System.out.println("Enter the vales to 1st matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=scanner.nextInt();
				
			}
		}
		System.out.println("Enter the vales to 2nd matrix");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				b[i][j]=scanner.nextInt();
				
			}
		}
		System.out.println("Addition of:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]+ "\t");
			}
			System.out.println("");
		}
		
		
		
		
	}

}
