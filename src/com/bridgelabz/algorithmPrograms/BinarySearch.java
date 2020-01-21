package com.bridgelabz.algorithmPrograms;
import com.bridgelabz.utility.Utility;

/**Title:Binary Search the Word from Word List

 * created by:Ankit Rajput
 *
 */
public class BinarySearch {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String arr[]= {"ankit","chetan","ganesh","ishan","lalit","zzzz"};
		System.out.println("Enter word to Search");
		String key=Utility.inputString();	//word to search
		int result=Utility.binarySearch(arr, key);	//arr is list of words
		if(result == -1) {
			System.out.println("Word Not Found");
		}
		else{
			System.out.println("Word Found At "+result);
		}
	}
	
}