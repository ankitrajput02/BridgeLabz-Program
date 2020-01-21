/**
 * Created By:Ankit Rajput
 * Title: Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N 
 *			I/P -> The Harmonic Value N. Ensure N != 0
 *			O/P -> Print the Nth Harmonic Value. 
 * Date:16/01/2020 
 */
package com.bridgelabz.coreprogram;
import com.bridgelabz.utility.Utility;;
public class HarmonicValue {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number to find Harmonic Value..");
		int num=Utility.inputNumber();
		Utility.harmonicValueOf(num);
	}
}