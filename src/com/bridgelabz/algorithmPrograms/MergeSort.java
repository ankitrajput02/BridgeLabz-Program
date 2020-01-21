package com.bridgelabz.algorithmPrograms;

import com.bridgelabz.utility.Utility;

/**Title:Program to do Merge Sort of list of Strings
 * Created By: Ankit Rajput
 *
 */

public class MergeSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"suraj","vicky","vishal","ankit","kunal","abhi"};
		 System.out.println("Given Array"); 
	        Utility.printArray(arr); 
	  
	        //MergeSort ms = new MergeSort(); 
	        Utility.sort(arr, 0, arr.length-1); 
	  
	        System.out.println("\nSorted array"); 
	        Utility.printArray(arr); 
			
	}
}
		

