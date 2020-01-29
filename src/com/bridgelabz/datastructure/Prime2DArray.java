package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**	Title : Program to find the Prime numbers in the range of 0 - 1000. Store the prime numbers in a 2D Array,
 * 	the first dimension represents the range 0-100, 100-200, and so on. While the second dimension represents 
 * the prime numbers in that range.
 * 
 * 
 */
public class Prime2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Start number and End Number..");
		int s=Utility.inputNumber();
		int e=Utility.inputNumber();
		int result[][]=Utility.primeRangeToArray( s , e );
		System.out.println("Prime Number in Array");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 26; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}


}
