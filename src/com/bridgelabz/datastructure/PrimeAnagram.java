package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**Title: Program to find the Prime numbers in the range of 0 - 1000. Store only prime numbers that are Anagrams
 * in the range.
 * Created By:Ankit Rajput 
 *
 */
public class PrimeAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Start number and End Number..");
		int s=Utility.inputNumber();
		int e=Utility.inputNumber();
		Utility.primeAnagram( s , e );
	}
}
