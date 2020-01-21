package com.bridgelabz.junit;

import com.bridgelabz.utility.Utility;

/**Created By:Ankit Rajput
 * Date:18/01/2020
 * Title:Program find the Fewest Notes to be returned for Vending Machine
 * Desc ->There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
 * returned by Vending Machine. Write a Program to calculate the minimum number
 * of Notes as well as the Notes to be returned by the Vending Machine as a Change
 * 
 */
public class VendingMachine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter amount");
		int amount=Utility.inputNumber();
		Utility.calculateNotes(amount);
	}

}
