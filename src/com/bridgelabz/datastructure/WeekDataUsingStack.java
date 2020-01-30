package com.bridgelabz.datastructure;

import com.bridgelabz.utility.StackUsingLinkedListUtility;
import com.bridgelabz.utility.StackUsingLinkedListUtility2;
import com.bridgelabz.utility.Utility;

/**	Title:Program to create the Week Object having a list of WeekDay objects each storing the day (i.e S,M,T,W,Th,..)
 *	and the Date (1,2,3..). to store the Queue in two Stacks. Stack here is also implemented using Linked List 
 *	Created By:Ankit Rajput
 */
public class WeekDataUsingStack {

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
			for (int i = 0; i < 7; i++) {		
				System.out.print(calendar[0][i]+"\t");
				String d=calendar[week][i];
				/*1<-2<-3<-4<-5<-6<-7  PUSH 1*/
				StackUsingLinkedListUtility.push(d);	//Push data into Stack1
			}

			for (int i = 0; i < 7; i++) {
				/*1->2->3->4->5->6->7  POP 1*/
				String data=StackUsingLinkedListUtility.pop();	//Pop data from Stack1
				/*7<-6<-5<-4<-3<-2<-1 PUSH 2*/
				StackUsingLinkedListUtility2.push(data);	//Push data into Stack2
			}
			System.out.println();
			for (int i = 0; i < 7; i++) {
				/*7->6->5->4->3->2->1 POP 2*/
				String data=StackUsingLinkedListUtility2.pop();	//Pop data from Stack2
				System.out.print(data+"\t");
			}
		}

	}
}
