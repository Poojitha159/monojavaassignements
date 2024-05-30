package com.techlabs.whileloop;
import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int i=2;
		int n=scanner.nextInt();
		while(i<=n) {
			if(i%2==0)
			 System.out.println(i);
			 i++;
		}
		scanner.close();
	}

}
