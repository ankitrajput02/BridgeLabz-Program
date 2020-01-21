package com.bridgelabz.algorithmPrograms;
/**Title:Program to print permutation of String
 * Created By:Ankit Rajput
 *
 */
import com.bridgelabz.utility.Utility;

public class PermutationString {

	
	public static void main(String[] args) {
		System.out.println("Enter String");
		String str=Utility.inputString();
		Utility.permutation(str,"");
	}		
	
}
