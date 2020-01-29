package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**Title:Prime Number Program and store only the numbers in that range that are Anagrams.
 * Created By:Ankit Rajput
 */
public class PrimeAnagramStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Start number and End Number..");
		int s=Utility.inputNumber();
		int e=Utility.inputNumber();
		Utility.anagramStack(s, e);
	}

}
