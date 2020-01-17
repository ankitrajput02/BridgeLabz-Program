/**
 * Created By:Ankit Rajput
 * Purpose:Computes the prime factorization of N using brute force and Print the Factorial of a Number
 * Date:16/01/2020 
 *
 *
 */

package com.bridgelabz.coreprogram;
import com.bridgelabz.utility.Utility;
public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number to Find Factorial");
		int num=Utility.inputNumber();
		Utility.factorOf(num);
	}
}