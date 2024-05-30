package com.techlabs.forloop;
import java.util.Scanner;

public class Pr {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner scanner=new Scanner(System.in);
		int start=scanner.nextInt();
		int end=scanner.nextInt();
		for(int num=start;num<=end;num++) {
			if(isPrime(num)){
				System.out.println(num+"");
				
			}
		}


	}
	static boolean isPrime(int num) {
		if (num<=1) {
			return false;
		}
		for(int i=1;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
