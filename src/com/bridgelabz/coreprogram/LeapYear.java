/**
 * Created By:Ankit Rajput
 * Title: Print the year is a Leap Year or not. 
 *			I/P -> Year, ensure it is a 4 digit number.
 *			O/P -> Print the year is a Leap Year or not.
 * Date:16/01/2020 
 */
package com.bridgelabz.coreprogram;
import com.bridgelabz.utility.Utility;
public class LeapYear {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Year to Check ");
		int year=Utility.inputNumber();
		boolean result=Utility.leapOrNot(year);
		if(result==true) {
			System.out.println("Year is Leap");
		}
		else {
			System.out.println("Year is Not Leap");
		}
	}
}