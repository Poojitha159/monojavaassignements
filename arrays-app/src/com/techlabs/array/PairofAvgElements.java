package com.techlabs.array;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class PairofAvgElements {

	/*public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=scanner.nextInt();
		int array[]=new int[n];
		System.out.println("Enter values in to array");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
		}
		int[] nums=null;
		int i=0;
		int index=0;
		pairAverage(array,nums);
		//System.out.println("pair is:"+array[i]+""+array[index]);
		if(pairAverage(array,nums)) {
			System.out.println(true);
			
		}
		else {
			System.out.println(false);
		}
	}
	public static boolean pairAverage(int array[],int[] n) {
		if(n==null ||n.length<2) {
			return false;
		}
		int sum=0;
		//String array=null;
		for(int i:n) {
			sum+=i;
		}
		double average=sum/n.length;
		double targetSum=2*average;
		//using set to store the elements and check for pair
		Set<Double> pair=new HashSet<>();
		for(int i:n) {
			if(pair.contains(targetSum - i)) {
				return true;
			}
			pair.add((double)i);
			return false;
		}
		return false;
		//double targetsum=2*average;
		/*for(int i=0;i<(array.length-1);i++) {
			for(int j=(i+1);j<array.length;j++) {
				if(n[i]+n[j]==sum) {
					if(sum==average) {
					return true;
				}
					}
				return false;
			}
		}return false;
	}*///return false;
	
public static void main(String[] args) { 
    Scanner scanner=new Scanner(System.in); 
    System.out.println("Enter size of array"); 
    int n=scanner.nextInt(); 
    int array[]=new int[n]; 
    System.out.println("Enter values in to array"); 
    for(int i=0;i<n;i++) { 
     array[i]=scanner.nextInt(); 
    } 
    //int[] nums=null; 
    
    if(pairAverage(array)) { 
     System.out.println("true"); 
      
    } 
    else { 
     System.out.println("false"); 
    } 
   } 
   public static boolean pairAverage(int n[]) { 
    if(n.length<2) { 
     return false; 
    } 
    int sum=0; 
     
    for(int i:n) { 
     sum+=i; 
    } 
    
    if(sum%n.length!=0) return false;
    int average=(int)(sum /n.length); 
    System.out.println("Average is:"+average);
    
    Set<Integer> pair=new HashSet<>(); 
    for(int i:n) { 
     if(pair.contains(average - i)) { 
      return true; 
     } 
     pair.add(i); 
     
    } 
    return false; 
    
   }
   }

