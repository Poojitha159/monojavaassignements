package com.techlabs.forloop;
import java.util.Scanner;

public class Primeinpattern {

	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		int prev=0,cur=0;
		for(int num=r1;num<=r2;num++) {
			
			if(isPrime(num)){
				System.out.println(num+"");
				
			}

	}
		if(prev+1 == cur) {
	          System.out.println();
	          prev=cur;
	          cur=0;
	        }
		System.out.print(i+"  ");
        cur++;

		
		sc.close();
	}
	static boolean isPrime(int num) {
		if (num<=1) {
			return false;
		}
		for(int i=2;i<=50;i++) {
			for(int j=2;j<i;j++) {
				
			
			if(num%i==0) {
				return false;
			}
		}
		}
		return true;
	}
	}

*/
	public static void main(String[] args) { 
		  Scanner sc=new Scanner(System.in); 
		  int cur=0,prev=0;
		  int r1=sc.nextInt(); 
		  int r2=sc.nextInt(); 
		  for(int num=r1;num<=r2;num++) { 
		    
		   if(isPrime(num)){ 
		     if(prev+1 == cur) {
		      System.out.println();
		      prev=cur;
		      cur=0;
		    }
		    System.out.print(num+" "); 
		     cur++;
		   } 
		 
		 } 
		   
		  sc.close(); 
		 } 
		 static boolean isPrime(int num) { 
		  if (num<=1) { 
		   return false; 
		  } 
		  for(int i=2;i<num;i++) { 
		  
		     
		    
		   if(num%i==0) { 
		    return false; 
		   } 
		   
		  } 
		  return true; 
		 }
}