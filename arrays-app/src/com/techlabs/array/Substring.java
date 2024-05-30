package com.techlabs.array;
import java.util.Scanner;
public class Substring {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr the string");
		String ch1=scanner.nextLine();
		System.out.println("Enetr the SubString");
		String ch2=scanner.nextLine();
		System.out.println(isSubstring(ch1,ch2));
       
	}
	public static boolean isSubstring(String ch1, String ch2) {
		
		int ch1length=ch1.length();
		int ch2length=ch2.length();
		for(int i=0;i<ch1length;i++) {
			int j;
			for(j=0;j<ch2length;j++) {
				if(ch1.charAt(i+j)!=ch2.charAt(j)) {
					break;
					
				}
			}
			if(j==ch2length) {
				return true;
			}
		}
		return false;
		//return ch1.contains(ch2);
		
		
		
	}

}
