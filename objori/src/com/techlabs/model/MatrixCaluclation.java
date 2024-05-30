package com.techlabs.model;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixCaluclation {
	public static void main(String args[]) {
		
		int matrix[][]=new int[3][3];
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enetr values to matrix");
		
		createRows(matrix,scanner);
		displayMatrix(matrix);
		
	}

	private static void displayMatrix(int[][] matrix) {
		//int i=0;
		//int j=0;
		//System.out.println(matrix[i][j]);
		//return matrix[i][j];
		for(int i=0;i<3;i++) {
		   System.out.println('\n');	
		  getColumns(i,matrix);
		  System.out.println();
		
	}
		  // System.out.println('\n');	

	}		   

	
	private static void getColumns(int i, int[][] matrix) {
		for(int j=0;j<3;j++) {
			   //System.out.println('\n');	

			System.out.print(matrix[i][j]+" ");
			//System.out.println("'\n ");
			
		}
		   //System.out.println('\n');	

	}
	   //System.out.println('\n');	

	

	

	private static void createRows(int[][] matrix, Scanner scanner) {
		for(int i=0;i<3;i++) {
			createColumn(i,matrix,scanner);
		}
		
	}

	private static void createColumn(int i, int[][] matrix, Scanner scanner) {
		for(int j=0;j<3;j++) {
			
			matrix[i][j]=scanner.nextInt();
		}
		
	}

}
