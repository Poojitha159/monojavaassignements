package com.techlabs.whileloop;

public class tebales {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
      //   int i=1;
         //i//nt j;
        // while(i<=10) {
        	// j=1;
        	 //while(j<=10) {
        		 
        	 
        		// System.out.printf(j + "*" + i + "=" + (i*j));
        	 //}//
        	 //System.out.println();
         //}
	//}

//}



    public static void main(String[] args) { 
        int i = 1; 
        while (i <= 10) { 
            
            int j = 1; 
            while (j <= 10) { 
                //int result = i * j; 
                System.out.printf("%5d",(i *  j)); 
                j++; 
            } 
            System.out.println(); // Add a line break between tables 
            i++; 
        } 
    } 
}