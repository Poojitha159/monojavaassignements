package com.techlabs.whileloop;

public class onetohund {

	public static void main(String[] args) {
		int i=1;
		while(i++<=100); {
			if(i<5) 
				continue;
			System.out.println(i);
			i++;
		}
		
	}

}
