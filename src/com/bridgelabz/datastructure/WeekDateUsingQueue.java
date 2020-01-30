package com.bridgelabz.datastructure;

import com.bridgelabz.utility.QueueLinkedListUtility;
import com.bridgelabz.utility.Utility;

/**	Title:Program to create the Week Object having a list of WeekDay objects each storing the day (i.e S,M,T,W,Th,..)
 *	and the Date (1,2,3..). The WeekDay objects are stored in a Queue implemented using Linked List.
 *	Further maintain also a Week Object in a Queue to finally display the Calendar
 *	Created By:Ankit Rajput
 */
public class WeekDateUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int week, month, year;
		System.out.println("Enter week from 1-5: ");
		week = Utility.inputNumber();
		System.out.print("Enter month from 1-12: ");
		month = Utility.inputNumber();
		System.out.print("Enter a year: ");
		year = Utility.inputNumber();

		if( 0 < week && week <= 5 && month > 0 && month <= 12) {	
			String calendar[][] = Utility.createCalendar(month, year);
			System.out.println("Week "+week+" is....");
			for (int j = 0; j < 7; j++) {		
				System.out.print(calendar[0][j]+"\t");	//display days
				QueueLinkedListUtility.enqueue(calendar[week][j]);	//store dates into Queue
			}
			System.out.println();
			QueueLinkedListUtility.printQueue();	
		}
		else {
			System.out.println("You entered wrong Input!!");
		}
	}

}