package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

/**Created By:Ankit Rajput
 * Purpose:Program to convert Decimal number into Binary by using toBinary() static method
 * 
 *
 */
public class BinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Decimal Number");
		int number=Utility.inputNumber();
		Utility.toBinary(number);
	}
}