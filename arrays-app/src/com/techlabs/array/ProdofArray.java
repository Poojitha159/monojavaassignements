package com.techlabs.array;
import java.util.Scanner;

public class ProdofArray {

	public static void main(String[] args) {
		  //int nums;
          Scanner scanner=new Scanner(System.in);
          System.out.println("Enter The size of array : ");
		   int n=scanner.nextInt();
		   int array[]= new int[n];
		   System.out.println("Enter entries of array ");
           for(int i=1;i<array.length;i++) {
        	   array[i]=scanner.nextInt();
        	   
        	   //System.out.println(array);
           }
           //int[] nums;
          productExcept(array);
           System.out.println("Producted array is ");
           for(int i=0;i<n;i++) {
        	   System.out.print(array[i]+" ");
           }
}



	public static int[] productExcept(int[] array) {
		
		int[] nums;
		
		int n=nums.length;
		int[] leftprod=new int[n];
		int[] rightprod=new int[n];
		int[] result=new int[n];
		leftprod[0]=1;
		for(int i=0;i<n;i++) {
			leftprod[i]=leftprod[i-1]*nums[i-1];
		}
		rightprod[n-1]=1;
		for(int i=n-2;i>=0;i--) {
			rightprod[i]=rightprod[i+1]*nums[i+1];
		}
		for(int i=0;i<n;i++) {
			result[i]=leftprod[i]*rightprod[i];
		}
		for(int x=1;x<n;x++) {
			
		      array[x]=result[x];
		    }
		//return n;
		//System.out.println("Producted array is ");
        //for(int x=0;x<n;x++) {
     	  // System.out.print(array[x]+" ");
	
        return n;

}
}






