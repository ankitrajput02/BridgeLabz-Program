package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

/**Title:Program Calendar.java that takes the month and year as input and prints the Calendar of the month. 
 * Store the Calendar in an 2D Array,the first dimension the week of the month and the second dimension stores 
 * the day of the week.
 * 
 *
 */
public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Month: ");
		int month = Utility.inputNumber();
		System.out.print("Enter year: ");
		int year = Utility.inputNumber();
		//input month and year to create Calender and store data into 2D array
		String calendar[][] = Utility.createCalendar(month, year); 
		for (int i = 0; i < 6; i++) {							
			for (int j = 0; j < 7; j++) {
				System.out.print("\t" + calendar[i][j]);
			}
			System.out.println();
		}
	}

}


