package com.techlabs.currency;
import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter withdrwal amount");
		/*int amount=scanner.nextInt();
		if(amount< 5000 && amount %100==0) {
			//System.out.println("Invalid Amount");
		
		   int numTwoThousands =amount%2000;
		   int numFiveHunderads =amount%500;
		   int numTwoHunderads =amount%200;
		   int numHunderads= amount%100;
		
		    System.out.println("Denominations are");
		    System.out.println("Two Thousand : " + numTwoThousands);
		    System.out.println("FIve Hunderads :" +numFiveHunderads);
		    System.out.println("Two Hunderads" + numTwoHunderads);
		    System.out.println("Hunderads"+ numHunderads);
		}
		else {
			System.out.println("Invalid Amount");
		}*/
		
				int amt = scanner.nextInt();
				if(amt <5000 && amt%100==0) {

				int twothousand = amt/2000;
				amt= amt%2000;
				int fivehund= amt/500;
				amt=amt%500;
				int twohund=amt/200;
				amt=amt%200;
				int hundred = amt/100;
				amt = amt%100;
			
		        System.out.println("No of twothoisands Notes :"+twothousand);
		        System.out.println("No of FiveHundred Notes :"+fivehund);
		        System.out.println("No of twoHundred Notes :"+twohund);
				System.out.println("No of Huned Notes :"+hundred);
				
			}
				else {
					System.out.println("Invalid amount");
				}
	
	      }
	
		
		
		


}