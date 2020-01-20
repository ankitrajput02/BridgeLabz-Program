package com.bridgelabz.junit;
import com.bridgelabz.utility.Utility;

/**
 * Purpose: To the Util Class add dayOfWeek static function that takes a date as input and prints the day of the
 * week that date falls on.For m use 1 for January, 2 for February, and so forth.
 * formulas, for the Gregorian calendar (where / denotes integer division):
 * y0 = y − (14 − m) / 12
 * x = y0 + y0/4 − y0/100 + y0/400
 * m0 = m + 12 × ((14 − m) / 12) − 2
 * d0 = (d + x + 31m0 / 12) mod 7
 *
 */
public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Month");
		int m=Utility.inputNumber();
		System.out.println("Enter Date");
		int d=Utility.inputNumber();
		System.out.println("Enter Year");
		int y=Utility.inputNumber();
		Utility.dayOfWeek(y, m, d);
		
	}
}
