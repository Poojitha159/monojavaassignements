package com.techlabs.array;
import java.util.Scanner;
public class Prodofarray2 {

	/*public static void main(String[] args) {
		// TODO -generated method stub
		Scanner scanner=new Scanner(System.in); 
        System.out.println("Enter The size of array : "); 
       int n=scanner.nextInt(); 
       int array[]= new int[n]; 
       System.out.println("Enter entries of array "); 
             for(int i=0;i<array.length;i++) { 
              array[i]=scanner.nextInt(); 
               
              
             } 
             
       // productExceptself(array); 
        
        for(int i=0;i<n;i++) System.out.print(array[i]+" ");
} 
 public static void productExceptself(int[] nums) { 
   
  int n=nums.length; 
  int[] leftprod=new int[n]; 
  int[] rightprod=new int[n]; 
  int[] result=new int[n]; 
  leftprod[0]=1; 
  for(int i=1;i<n;i++) { 
   leftprod[i]=leftprod[i-1]*nums[i-1]; 
  }                                                    //[2 3 4 5 6 7]
  rightprod[n-1]=1; 
  for(int i=n-2;i>=0;i--) {                            //left=[2,3,4]  right= [5,6,7]
   rightprod[i]=rightprod[i+1]*nums[i+1];              //[0,    ]                    // [    ]
  } 
  for(int i=0;i<n;i++) { 
   result[i]=leftprod[i]*rightprod[i]; 
  } 
  for(int x=0;x<n;x++) { 
    
        nums[x]=result[x]; 
      }
 }

	}
*/
	
	    public static int[] productExceptSelf(int[] nums) {
	        int n = nums.length;
	        int[] prod = new int[n];
	        
	        // Initialize prod array with 1
	        for (int i = 0; i < n; i++) {
	            prod[i] = 1;
	        }
	        
	        // Calculate product of all elements to the left of i
	        int leftProduct = 1;
	        for (int i = 0; i < n; i++) {
	            prod[i] *= leftProduct;   //prod[i]=prod[i]*leftprod;
	            leftProduct *= nums[i];   //leftprod=leftprod*nums[i]; 
	        }
	        
	        // we calculate product of all elements to the right of i
	        int rightProduct = 1;
	        for (int i = n - 1; i >= 0; i--) {
	            prod[i] *= rightProduct;
	            rightProduct *= nums[i];
	        }
	        
	        return prod;
	    }

	    public static void main(String[] args) {
	    	Scanner scanner=new Scanner(System.in);
	    	System.out.println("Enter The size of array : "); 
	        int n=scanner.nextInt();
	        //int nums;
	        int array[]= new int[n]; 
	        System.out.println("Enter entries of array "); 
	              for(int i=0;i<array.length;i++) { 
	               array[i]=scanner.nextInt();
	              }
	    	
	        //int[] nums = Int(scanner.nextInt());//{1, 2, 3, 4};
	        int result[] = productExceptSelf(array);
	        
	        // Print the result
	        for (int num : result) {
	            System.out.print( num+" ");
	        }
	        
	    }
	}




	
	