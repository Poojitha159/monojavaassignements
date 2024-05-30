package com.techlabs.water;
import java.util.Scanner;
public class Water {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int charge,total_waterbill;
		int metercharge=75;
		System.out.println("enter consumed data ");
		int condata=sc.nextInt();
		if(condata>=100) {
			if(condata<=250)
			{
				charge=condata*10;
			}
			else {
				charge=condata*20;
			}
		}
		else {
			charge=condata*5;
			
		}
	total_waterbill=charge+metercharge;
	System.out.println("total water bill is" +total_waterbill);
	}

}
